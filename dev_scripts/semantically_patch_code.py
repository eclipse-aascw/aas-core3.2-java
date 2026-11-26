# SPDX-FileCopyrightText: 2026 aas-core3.2-java AUTHORS
#
# SPDX-License-Identifier: MIT

"""Generate the SDK based on the aas-core-meta model and the snippets."""

import os
import pathlib
import subprocess
import sys
from typing import Optional, Sequence, Mapping


def _execute(
    cmd: Sequence[str],
    stdout: Optional[int] = None,
    stderr: Optional[int] = None,
    cwd: Optional[str] = None,
    env: Optional[Mapping[str, str]] = None,
) -> int:
    """
    Execute the command and print if something went wrong.

    Return the non-zero exit code, or None if the exit code was zero.
    """
    cmd_joined = " ".join(cmd)

    try:
        exit_code = subprocess.call(cmd, stdout=stdout, stderr=stderr, cwd=cwd, env=env)
    except FileNotFoundError as exception:
        print(f"Failed to execute {cmd_joined}: {exception}", file=sys.stderr)
        return 1

    if exit_code != 0:
        print(
            f"Failed to execute {cmd_joined} with exit code: {exit_code}",
            file=sys.stderr,
        )

    return exit_code


def _check_all_tools_installed() -> int:
    """Check that Git, Java and Maven are installed and work properly."""
    exit_code = _execute(
        cmd=["java", "-version"], stdout=subprocess.DEVNULL, stderr=subprocess.DEVNULL
    )
    if exit_code != 0:
        return exit_code

    exit_code = _execute(
        cmd=["mvn", "-version"], stdout=subprocess.DEVNULL, stderr=subprocess.DEVNULL
    )
    if exit_code != 0:
        return exit_code

    return 0


def _semantically_patch(our_repo: pathlib.Path) -> int:
    """Run the scripts to semantically patch the generated code."""
    cwd = our_repo / "dev_scripts" / "semantic-patching"

    verification_java = (
        our_repo / "src/main/java/aas_core/aas3_2/verification/Verification.java"
    )
    assert (
        verification_java.exists() and verification_java.is_file()
    ), f"No Verification.java found to patch: {verification_java=}"

    exit_code = _execute(cmd=["mvn", "package"], cwd=str(cwd))

    if exit_code != 0:
        return exit_code

    exit_code = _execute(
        [
            "mvn",
            "exec:java",
            "-Dexec.mainClass=aas_core_works.PatchVerification",
            f"-Dexec.args={verification_java} {verification_java}",
        ],
        cwd=str(cwd),
    )

    return exit_code


def main() -> int:
    """Execute the main routine."""
    exit_code = _check_all_tools_installed()
    if exit_code != 0:
        return exit_code

    repo_root = pathlib.Path(os.path.realpath(__file__)).parent.parent

    exit_code = _semantically_patch(repo_root)

    if exit_code != 0:
        print(
            f"Failed to semantically patch Verification.java with exit code: {exit_code}",
            file=sys.stderr,
        )
        return exit_code

    return 0


if __name__ == "__main__":
    sys.exit(main())
