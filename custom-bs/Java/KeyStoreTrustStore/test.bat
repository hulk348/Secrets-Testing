set KEYSTORE_PASSWORD=dfsdfs$erf2
set TRUSTSTORE_PASSWORD=wqewe34234+ewr

java ^
  -Dserver.ssl.key-store=%KEYSTORE_PATH% ^
  -Dserver.ssl.key-store-password=%KEYSTORE_PASSWORD% ^
  -Dserver.ssl.key-store-type=JKS ^
  -Dserver.ssl.trust-store=%TRUSTSTORE_PATH% ^
  -Dserver.ssl.trust-store-password=%TRUSTSTORE_PASSWORD% ^
  -Dserver.ssl.trust-store-type=JKS ^
  -jar your-application.jar
