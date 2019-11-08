package com.ak4.dp.observer;

public class TestObserverPattern {
	
	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();
		Observer phoneObserver = new PhoneDisplay(weatherStation);
		Observer watchObserver = new WatchDisplay(weatherStation);
		Observer desktopObserver = new DesktopDisplay(weatherStation);
		weatherStation.register(phoneObserver);
		weatherStation.register(watchObserver);
		weatherStation.register(desktopObserver);
		
		weatherStation.setTemperature(36);
		weatherStation.notifyChange();
	}
}
