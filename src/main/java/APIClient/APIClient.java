package APIClient;

import model.GoogleResponse;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class APIClient {

    private static final String ADDRESS = "https://maps.googleapis.com/maps/api/geocode/json";

    public GoogleResponse getGoogleResponse(String input) {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(getURL(input));
        Response response = target.request().get();
        return response.readEntity(GoogleResponse.class);
    }

    private String getURL(String input) {
        return new StringBuilder()
                .append(ADDRESS)
                .append("?key=")
                .append(getAPIKey())
                .append("&address=")
                .append(input)
                .toString();
    }

    public String getAPIKey() {
        String userName = System.getProperty("user.name");
        FileReader fileReader;
        try {
            fileReader = new FileReader("C:\\Users\\" + userName + "\\Documents\\Google_API_key.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "File with API key not found";
        }
        Scanner scanner = new Scanner(fileReader);
        return scanner.next();
    }
}
