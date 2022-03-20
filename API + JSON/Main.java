import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.*;
import java.net.*;
import java.net.http.*;

public class Main {

    private static HttpURLConnection connection;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ! OpenWeatherMapAPI Key = 0e8b2c4e5a41d2b3b81897c77b9e4d88
        // ?
        // https://api.openweathermap.org/data/2.5/weather?q=dhahran&appid=0e8b2c4e5a41d2b3b81897c77b9e4d88&units=metric

        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();

        try {

            System.out.print("Please Enter The City Name : ");

            String city = scanner.next();

            URL url = new URL(
                    "https://api.openweathermap.org/data/2.5/weather?q=" + city
                            + "&appid=0e8b2c4e5a41d2b3b81897c77b9e4d88&units=metric");

            connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();

            if (status > 299) {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            } else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            }

            JSONObject jsonObj = new JSONObject(responseContent.toString());

            String lat = jsonObj.getJSONObject("coord").get("lat").toString();
            String lon = jsonObj.getJSONObject("coord").get("lon").toString();

            String temp = jsonObj.getJSONObject("main").get("temp").toString();

            JSONArray jsonArray = jsonObj.getJSONArray("weather");
            String main = jsonArray.get(0).toString();

            JSONObject jsonMain = new JSONObject(main);

            main = jsonMain.get("description").toString();

            int tempNum = (int) Math.round(Double.parseDouble(temp));

            System.out.println(
                    "Coords :\n" +
                            "  Latitude : " + lat + "\n" +
                            "  Longitude : " + lon + "\n" +
                            "Description : " + main + "\n" +
                            // "Main : " + weatherMain + "\n" +
                            "Temperature : " + (tempNum) + " °C \n");

        } catch (Exception e) {
            System.out.println("Not Working !");
        } finally {
            connection.disconnect();
        }

    }

}