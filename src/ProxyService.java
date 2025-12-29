public class ProxyService implements Service {
    private RealService realService = new RealService();
    private String cache;
    private long lastTime;

    @Override
    public String getWeather()
    {
        long now = System.currentTimeMillis();
        if (cache == null || (now - lastTime > 5000))
        {
            cache = realService.getWeather();
            lastTime = now;
        } else
        {
            System.out.println("Loading from cache...");
        }

        return cache;
    }
}