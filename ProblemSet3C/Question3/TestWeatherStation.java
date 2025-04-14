package ProblemSet3C.Question3;

public class TestWeatherStation {

    public static void main(String[] args) {

        Subject weatherStation = new WeatherStation();
        Observer airPollutionWarningApp = new AirPollutionWarningApp(weatherStation);
        Observer dataLogger = new DataLogger(weatherStation);

        System.out.println(airPollutionWarningApp); // Air Quality:GOOD
        weatherStation.updateData(120);
        System.out.println(airPollutionWarningApp); //Air Quality:UNHEALTHY
        System.out.println(dataLogger); //DataLogger:120.0

    }
}
