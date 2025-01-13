##AWS
$AWSAccessKeyID = "AKIA1EFI699BGIWJD8U9"
$AWSRegion = "us-east-1"


##PASSWORD
$User = "admin"
$Password = "RandomKey*&76"
$Server = "localhost"

function Connect-AWS {
    Write-Output "Connecting to AWS..."
    Write-Output "Access Key ID: $AWSAccessKeyID"
    Write-Output "Region: $AWSRegion"
    Start-Sleep -Seconds 2
    Write-Output "Successful connection to AWS."
}

function Connect-Database {
    Write-Output "Connecting to database..."
    Write-Output "Server: $Server"
    Write-Output "User: $User"
    Write-Output "Password: $Password"
    Start-Sleep -Seconds 2
    Write-Output "Successful connection to database."
}

Write-Output "=== EXECUTING CONFIGURATION SCRIPT ==="
Connect-AWS
Connect-Database
Write-Output "=== SCRIPT COMPLETED ==="
