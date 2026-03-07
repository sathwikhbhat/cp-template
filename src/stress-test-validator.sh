#!/usr/bin/env bash

set -euo pipefail

javac -d ../out Main.java Brute.java Generator.java Validator.java

testDir="../out/tests"
mkdir -p "$testDir"

while true; do
    java -cp ../out Generator > "$testDir/input.txt"

    java -cp ../out Main < "$testDir/input.txt" > "$testDir/sol.txt"

    java -cp ../out Brute < "$testDir/input.txt" > "$testDir/brute.txt"

    cat "$testDir/brute.txt" "$testDir/sol.txt" | java -cp ../out Validator > "$testDir/verdict.txt"

    verdict="$(tr -d '[:space:]' < "$testDir/verdict.txt")"
    if [[ "$verdict" != "AC" ]]; then
        echo
        echo "MISMATCH DETECTED"
        echo "===== INPUT ====="
        cat "$testDir/input.txt"
        echo
        echo "===== BRUTE ====="
        cat "$testDir/brute.txt"
        echo
        echo "===== SOLUTION ====="
        cat "$testDir/sol.txt"
        echo
        echo "===== VERDICT ====="
        cat "$testDir/verdict.txt"
        break
    fi

    echo "AC"
done
