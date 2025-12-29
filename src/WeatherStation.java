import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<Observer> users = new ArrayList<>();
    private Service weatherService = new ProxyService();

    public void addObserver(Observer o)
    {
        users.add(o);
    }

    public void checkWeather()
    {
        String data = weatherService.getWeather();
        for (Observer user : users)
        {
            user.update(data);
        }
    }
}