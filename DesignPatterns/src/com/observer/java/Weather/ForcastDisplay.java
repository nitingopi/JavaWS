package com.observer.java.Weather;

import java.util.Observable;
import java.util.Observer;

public class ForcastDisplay implements Observer, DisplayElement {

	private Observable observable;
	private float pressure;
	private float lastPressure;

	public ForcastDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void display() {
		String message;
		if (pressure < lastPressure) {
			message = "Forcast : Watchout for cooler, rainy weather";
		} else if (pressure == lastPressure) {
			message = "Forcast : More or less same";

		} else {
			message = "Forcast : Improving weather on the way";
		}
		System.out.println(message);

	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			lastPressure = pressure;
			pressure = weatherData.getPressure();
			display();
		}

	}

}
