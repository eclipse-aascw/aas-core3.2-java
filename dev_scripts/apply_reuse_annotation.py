# SPDX-FileCopyrightText: 2026 aas-core3.2-java AUTHORS
#
# SPDX-License-Identifier: MIT

"""Apply the REUSE annotation for the generated code."""

import argparse
import os
import pathlib
import subprocess
import sys

_LICENSE = "MIT"

_COPYRIGHT = "aas-core3.2-java AUTHORS"

_YEAR = "2025"


def main() -> int:
    """Execute the main routine."""
    parser = argparse.ArgumentParser(description=__doc__)
    _ = parser.parse_args()

    repo_root = pathlib.Path(os.path.realpath(__file__)).parent.parent

    src_dir = os.path.relpath(str(repo_root / "src" / "main"), os.getcwd())
    test_dir = os.path.relpath(str(repo_root / "src" / "test"), os.getcwd())

    subprocess.run(
        [
            sys.executable,
            "-m",
            "reuse",
            "annotate",
            "--copyright",
            _COPYRIGHT,
            "--year",
            _YEAR,
            "--license",
            _LICENSE,
            "--skip-unrecognised",
            "-r",
            src_dir,
            test_dir,
        ],
        check=True,
    )

    return 0


if __name__ == "__main__":
    sys.exit(main())
