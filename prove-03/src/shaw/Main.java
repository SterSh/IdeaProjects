package shaw;

import com.google.gson.Gson;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter City:");

        String city = myObj.nextLine();  // Read user input

        String key = "24a2b43b217d74ed51778f8f949d3cbd";
        String condUrl = " https://api.openweathermap.org/data/2.5/weather?q=" + city + "&units=imperial&apiKey=" + key;
        String foreUrl = " https://api.openweathermap.org/data/2.5/forecast?q=" + city + "&units=imperial&apiKey=" + key;

        HTTPHelper data = new HTTPHelper();
        String result = data.readHTTP(condUrl);
        String result2 = data.readHTTP(foreUrl);
        Gson gson = new Gson();
        Gson gson1 = new Gson();
        WeatherConditions text = gson.fromJson(result, WeatherConditions.class);
        WeatherForecast forecast = gson1.fromJson(result2, WeatherForecast.class);
        System.out.println(text);
        System.out.println(forecast);

    }

}
