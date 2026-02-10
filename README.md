# CP Template

## Files
- `Main.java`: Main optimized solution
- `Brute.java`: Slow but guaranteed correct solution
- `Generator.java`: Generates random test cases for stress testing
- `Validator.java`: Custom logic to validate output (used by `stress-validator.ps1`)
- `stress-diff.ps1`: PowerShell script to compare output between `Main.java` and `Brute.java` directly
- `stress-validator.ps1`: PowerShell script to validate the solution's output using `Validator.java`

## Usage
1. Open a terminal in the `src` folder
2. Run a stress test:
   - For direct comparison:
     ```powershell
     ./stress-test-diff.ps1
     ```
   - For custom validation:
     ```powershell
     ./stress-test-validator.ps1
     ```
3. The script will continuously generate tests and compare outputs. It stops automatically and displays the failing input if a mismatch or validation failure is detected.

> **Note:** The scripts automatically compile your Java files into the `out` folder before running
