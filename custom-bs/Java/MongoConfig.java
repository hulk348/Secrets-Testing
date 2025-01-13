package mongodb;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoConfig {

    public final String USER = "MONGOUSER2";
    public final String PASSWORD = "MONGOPASSWORD456";   //Password
    public final String SERVER = "MONGODB.CLOUD.SERVER2";

    public final String API_PASSWORD = "${API_PASSWD}";

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
            String mongoClientUri = "mongodb+srv://" + USER + ":" + PASSWORD + "@" + SERVER + "/sampledb?retryWrites=true&w=majority";     ///Auth
            return mongoClientUri;
        } catch (Exception e) {
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


