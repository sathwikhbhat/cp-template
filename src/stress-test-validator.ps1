javac -d ../out Codeforces.java Brute.java Generator.java Validator.java

$testDir = "../out/tests"
New-Item -ItemType Directory -Force -Path $testDir | Out-Null

while ($true)
{
    java -cp ../out Generator | Out-File "$testDir/input.txt"

    Get-Content "$testDir/input.txt" | java -cp ../out Codeforces | Out-File "$testDir/sol.txt"

    Get-Content "$testDir/input.txt" | java -cp ../out Brute | Out-File "$testDir/brute.txt"

    Get-Content "$testDir/brute.txt", "$testDir/sol.txt" | java -cp ../out Validator | Out-File "$testDir/verdict.txt"

    if ((Get-Content "$testDir/verdict.txt").Trim() -ne "AC")
    {
        Write-Host "`nMISMATCH DETECTED"
        Write-Host "===== INPUT ====="
        Get-Content "$testDir/input.txt"
        Write-Host "`n===== BRUTE ====="
        Get-Content "$testDir/brute.txt"
        Write-Host "`n===== SOLUTION ====="
        Get-Content "$testDir/sol.txt"
        Write-Host "`n===== VERDICT ====="
        Get-Content "$testDir/verdict.txt"
        break
    }

    Write-Host "AC"
}
