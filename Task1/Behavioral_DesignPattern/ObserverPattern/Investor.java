package Task1.Behavioral_DesignPattern.ObserverPattern;

public class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(float price) {
        System.out.println(name + " notified: Stock price updated to $" + price);
    }
}
