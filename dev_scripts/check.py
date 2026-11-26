# SPDX-FileCopyrightText: 2026 aas-core3.2-java AUTHORS
#
# SPDX-License-Identifier: MIT

"""Check that the code is formatted, the tests pass and the docs can be generated."""

import argparse
import os
import pathlib
import subprocess
import sys


def main() -> int:
    """Execute the main routine."""
    parser = argparse.ArgumentParser(description=__doc__)
    _ = parser.parse_args()

    repo_root = pathlib.Path(os.path.realpath(__file__)).parent.parent

    # NOTE: The spotless `apply` goal is bound to the `validate` phase, so any
    # lifecycle phase (test, javadoc) re-formats the code. The formatting check
    # has to run first, directly as a goal, so that it sees the code as committed.
    steps = [
        ("Checking the formatting...", ["spotless:check"]),
        ("Running the tests...", ["test"]),
        ("Generating the docs...", ["javadoc:javadoc"]),
    ]

    failed = []

    print("Checking the REUSE compliance...")
    exit_code = subprocess.call(
        [sys.executable, "-m", "reuse", "lint"], cwd=str(repo_root)
    )
    if exit_code != 0:
        failed.append("Checking the REUSE compliance")

    for message, goals in steps:
        print(message)
        exit_code = subprocess.call(["mvn", "--batch-mode", *goals], cwd=str(repo_root))
        if exit_code != 0:
            failed.append(message.rstrip("."))

    if failed:
        print("FAILED:", file=sys.stderr)
        for message in failed:
            print(f"* {message}", file=sys.stderr)
        return 1

    print("All checks passed.")
    return 0


if __name__ == "__main__":
    sys.exit(main())
