package Task1.Behavioral_DesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<Observer> observers = new ArrayList<>();
    private float price;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setPrice(float price) {
        this.price = price;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }
}
