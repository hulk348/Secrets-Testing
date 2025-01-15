import java.security.KeyStore;

class Test
{
    public static void main(String[] args)
    {
        System.out.println("hello world secrets example.");


        // Load KeyStore
        KeyStore keyStore = KeyStore.getInstance("JKS");
        keyStore.load(new FileInputStream("path/to/keystore.jks"), "dfsdfs$erf2".toCharArray());

        // Load TrustStore
        KeyStore trustStore = KeyStore.getInstance("JKS");
        trustStore.load(new FileInputStream("path/to/truststore.jks"), "wqewe34234+ewr".toCharArray());

    }
}