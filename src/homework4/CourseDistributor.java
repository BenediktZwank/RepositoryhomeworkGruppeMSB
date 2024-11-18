package homework4;

import java.util.ArrayList;
import java.util.List;

public class CourseDistributor {

    private List<Observer> observers = new ArrayList<>();

    // Beobachter hinzufügen
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Beobachter entfernen
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Alle Beobachter benachrichtigen
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }

    }
}
