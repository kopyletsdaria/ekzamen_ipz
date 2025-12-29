public class Main {
    public static void main(String[] args) throws InterruptedException
    {
        WeatherStation station = new WeatherStation();
        station.addObserver(new Client("iPhone"));

        station.checkWeather();

        station.checkWeather();

        Thread.sleep(6000);

        station.checkWeather();
    }
}