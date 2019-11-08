package com.ak4.dp.observer;

public class DesktopDisplay implements Observer {

	private Observable observable;
	
	public DesktopDisplay(Observable observable) {
		this.observable = observable;
	}
	
	@Override
	public void update() {
		int currentTemp = observable.getTemperature();
		System.out.println(currentTemp + " temperature in DesktopDisplay");
	}
}
