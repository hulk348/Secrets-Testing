package mongodb;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoConfig {

    // Variables únicas para este archivo
    public final String USER = "MONGOUSER2";
    public final String PASSWORD = "MONGOPASSWORD456";   //Password
    public final String SERVER = "MONGODB.CLOUD.SERVER2";

    //False positive using Spring interpolation
    public final String API_PASSWORD = "${API_PASSWD}"

    public String getUser() {
        return USER;
    }

    public String getPassword() {
        return PASSWORD;
    }

    public String getServer() {
        return SERVER;
    }

    public String getMongoClientUri() {
        try {
            // Construir la URI de MongoDB dinámicamente
            // String mongoClientUri = "mongodb+srv://user123:1234@172.16.17.205/sampledb?retryWrites=true&w=majority";
            String mongoClientUri = "mongodb+srv://" + USER + ":" + PASSWORD + "@" + SERVER + "/sampledb?retryWrites=true&w=majority";     ###Auth
            return mongoClientUri;
        } catch (Exception e) {
            // Manejar posibles errores en la construcción de la URI
            System.err.println("Error al construir la URI de MongoDB: " + e.getMessage());
            return null;
        }
    }

    @Override
    public String toString() {
        return "MongoConfig2{" +
                "USER='" + USER + '\'' +
                ", PASSWORD='" + PASSWORD + '\'' +
                ", SERVER='" + SERVER + '\'' +
                ", mongoClientUri='" + getMongoClientUri() + '\'' +
                '}';
    }
}


