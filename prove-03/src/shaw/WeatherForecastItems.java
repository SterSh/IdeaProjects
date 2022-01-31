package shaw;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class WeatherForecastItems {

    private String dt_txt;
    @SerializedName("main")
    private Map<String, Float> measurements;
    private WeatherWind wind;
    private List<WeatherDescription> weather;

    public WeatherForecastItems(String dt_txt, Map<String, Float> measurements, WeatherWind wind, WeatherDescription weather) {
        this.dt_txt = dt_txt;
        this.measurements = measurements;
        this.wind = wind;
        this.weather = (List<WeatherDescription>) weather;
    }

    public String toString() {
        return "WeatherForecastItems " +
                "time=" + dt_txt +
                "measurements=" + measurements +
                ", wind=" + wind +
                " description=" + weather + "\n";
    }
}
