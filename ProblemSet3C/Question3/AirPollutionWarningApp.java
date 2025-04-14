package ProblemSet3C.Question3;

public class AirPollutionWarningApp implements Observer{

    private double airQualityIndex;
    private Subject weatherStation;

    private AirQuality airQuality = AirQuality.GOOD;

    public AirPollutionWarningApp( Subject weatherStation ){
        this.weatherStation = weatherStation;
        this.weatherStation.addObserver(this);
    }


    @Override
    public void onUpdate(double value) {
        airQualityIndex = value;
        specifyAirQuality();
    }

    private void specifyAirQuality( ){
        System.out.println(airQualityIndex);
        if( airQualityIndex > 100 ){
            airQuality = AirQuality.UNHEALTHY;
        }else if( airQualityIndex > 50){
            airQuality = AirQuality.MODERATE;
        }else{
            airQuality = AirQuality.GOOD;
        }
    }

    @Override
    public String toString() {
        return "Air Quality:" + airQuality.name();
    }
}
