package observerpattern;

import java.util.List;
/*Observer Pattern defines a one to many dependency between objects so that when one object changes state, all its
dependents are notified and updated automatically */
public interface Subject {
    void addObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
