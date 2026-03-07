# CP Template

## Files
- `Main.java`: Main optimized solution
- `Brute.java`: Slow but guaranteed correct solution
- `Generator.java`: Generates random test cases for stress testing
- `Validator.java`: Custom logic to validate output (used by `stress-test-validator.sh`)
- `stress-test-diff.sh`: Bash script to compare output between `Main.java` and `Brute.java` directly
- `stress-test-validator.sh`: Bash script to validate the solution's output using `Validator.java`

## Usage
1. Open a terminal in the `src` folder
2. Run a stress test:
   - For direct comparison:
     ```bash
     ./stress-test-diff.sh
     ```
   - For custom validation:
     ```bash
     ./stress-test-validator.sh
     ```
3. The script will continuously generate tests and compare outputs. It stops automatically and displays the failing input if a mismatch or validation failure is detected.

> **Note:** Run `chmod +x stress-test-diff.sh stress-test-validator.sh` once to make the scripts executable.
> The scripts automatically compile your Java files into the `out` folder before running.
