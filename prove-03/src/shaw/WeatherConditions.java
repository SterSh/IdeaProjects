package shaw;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class WeatherConditions {

    private int id;
    private String name;
    @SerializedName("main")
    private Map<String, Float> measurements;

    public WeatherConditions (int id, String name, Map<String, Float> measurements) {
        this.id = id;
        this.name = name;
        this.measurements = measurements;
    }

    public String toString() {
        return "WeatherConditions: " +
                "ID = " + id +
                ", City = '" + name + '\'' +
                ", Measurements = " + measurements;
    }
}
