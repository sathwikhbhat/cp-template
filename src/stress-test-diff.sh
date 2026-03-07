#!/usr/bin/env bash

set -euo pipefail

javac -d ../out Main.java Brute.java Generator.java

testDir="../out/tests"
mkdir -p "$testDir"

while true; do
    java -cp ../out Generator > "$testDir/input.txt"

    java -cp ../out Main < "$testDir/input.txt" > "$testDir/sol.txt"

    java -cp ../out Brute < "$testDir/input.txt" > "$testDir/brute.txt"

    if ! diff -u "$testDir/sol.txt" "$testDir/brute.txt" > "$testDir/diff.txt"; then
        echo
        echo "MISMATCH DETECTED"
        echo "===== INPUT ====="
        cat "$testDir/input.txt"
        echo
        echo "===== SOLUTION ====="
        cat "$testDir/sol.txt"
        echo
        echo "===== BRUTE ====="
        cat "$testDir/brute.txt"
        echo
        echo "===== DIFF ====="
        cat "$testDir/diff.txt"
        break
    fi

    echo "AC"
done
