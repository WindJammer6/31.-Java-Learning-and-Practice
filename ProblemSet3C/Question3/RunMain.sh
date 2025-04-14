echo "Compiling AirQuality.java. If no error messages appear below, then there are no syntax errors"
javac -d . AirQuality.java

echo "Compiling Observer.java. If no error messages appear below, then there are no syntax errors"
javac -d . Observer.java
echo "Compiling DataLogger.java. If no error messages appear below, then there are no syntax errors"
javac -d . DataLogger.java
echo "Compiling AirPollutionWarningApp.java. If no error messages appear below, then there are no syntax errors"
javac -d . AirPollutionWarningApp.java

echo "Compiling Subject.java. If no error messages appear below, then there are no syntax errors"
javac -d . Subject.java

echo "Compiling WeatherStation.java. If no error messages appear below, then there are no syntax errors"
javac -d . WeatherStation.java

echo "Compiling TestWeatherStation.java. If no error messages appear below, then there are no syntax errors"
javac -d . TestWeatherStation.java

echo "Running the main function()"
java TestWeatherStation