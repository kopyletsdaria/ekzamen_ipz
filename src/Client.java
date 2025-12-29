public class Client implements Observer {
    private String name;

    public Client(String name)
    {
        this.name = name;
    }

    @Override
    public void update(String weather)
    {
        System.out.println(name + ": " + weather);
    }
}