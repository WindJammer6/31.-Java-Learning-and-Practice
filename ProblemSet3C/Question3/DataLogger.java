package ProblemSet3C.Question3;

public class DataLogger implements Observer{

    private double value;
    private Subject weatherStation;

    public DataLogger( Subject weatherStation ){
        this.weatherStation = weatherStation;
        this.weatherStation.addObserver(this);
    }

    @Override
    public void onUpdate(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "DataLogger:" + value;
    }
}
