package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ObservedSubject{
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer obj) {
        observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
       boolean removed =  observers.remove(obj);
    }

    @Override
    public void notifyObservers(String message) {
       for(Observer observer:observers){
           observer.update(message);
       }
    }

    public void teach(String topic) {
        for (Observer observer : observers) {
            observer.update(topic);
        }
    }

}
