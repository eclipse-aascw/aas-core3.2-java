# SPDX-FileCopyrightText: 2026 aas-core3.2-java AUTHORS
#
# SPDX-License-Identifier: MIT

"""Re-format the Java code with Spotless (google-java-format)."""

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

    subprocess.check_call(["mvn", "--batch-mode", "spotless:apply"], cwd=str(repo_root))

    return 0


if __name__ == "__main__":
    sys.exit(main())
