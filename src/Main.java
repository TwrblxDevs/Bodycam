import functions.HTTP.HttpGet;
import functions.HTTP.HttpResponse;


public class Main {
    public static void main(String[] args) throws Exception {
        HttpGet httpGet = new HttpGet();
        String testRequestURL = "https://www.google.com/";

        HttpResponse response = httpGet.SendGet(testRequestURL);

        if (response.getStatusCode() == 200) {
            System.out.println("Google Online");
        } else {
            System.out.println("Google Offline");
        }
    }
}
