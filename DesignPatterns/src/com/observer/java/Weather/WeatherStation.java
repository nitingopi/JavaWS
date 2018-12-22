package com.observer.java.Weather;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

		// StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
		ForcastDisplay forecastDisplay = new ForcastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);

	}

}
