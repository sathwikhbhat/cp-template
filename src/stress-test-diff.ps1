javac -d ../out Main.java Brute.java Generator.java

$testDir = "../out/tests"
New-Item -ItemType Directory -Force -Path $testDir | Out-Null

while ($true)
{
    java -cp ../out Generator | Out-File "$testDir/input.txt"

    Get-Content "$testDir/input.txt" | java -cp ../out Main | Out-File "$testDir/sol.txt"

    Get-Content "$testDir/input.txt" | java -cp ../out Brute | Out-File "$testDir/brute.txt"

    Compare-Object `
        (Get-Content "$testDir/sol.txt") `
        (Get-Content "$testDir/brute.txt") |
            Out-File "$testDir/diff.txt"

    if ((Get-Content "$testDir/diff.txt").Length -ne 0)
    {
        Write-Host "`nMISMATCH DETECTED"
        Write-Host "===== INPUT ====="
        Get-Content "$testDir/input.txt"
        Write-Host "`n===== SOLUTION ====="
        Get-Content "$testDir/sol.txt"
        Write-Host "`n===== BRUTE ====="
        Get-Content "$testDir/brute.txt"
        Write-Host "`n===== DIFF ====="
        Get-Content "$testDir/diff.txt"
        break
    }

    Write-Host "AC"
}
