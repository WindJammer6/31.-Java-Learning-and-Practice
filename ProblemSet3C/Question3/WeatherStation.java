package ProblemSet3C.Question3;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    private List<Observer> observerList;
    private double airPollutionIndex = 100;

    public WeatherStation(){
        observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void updateData(double data) {
        airPollutionIndex = data;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer o : this.observerList){
            o.onUpdate(airPollutionIndex);
        }
    }
}
