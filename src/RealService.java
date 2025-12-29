public class RealService implements Service {
    @Override
    public String getWeather()
    {
        System.out.println("Connecting to server...");
        return "Sunny, +25";
    }
}
