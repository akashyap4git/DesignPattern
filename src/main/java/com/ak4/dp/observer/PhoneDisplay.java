package com.ak4.dp.observer;

public class PhoneDisplay implements Observer {
	
	private Observable observable;
	
	public PhoneDisplay(Observable observable) {
		this.observable = observable;
	}

	@Override
	public void update() {
		int currentTemp = observable.getTemperature();
		System.out.println(currentTemp + " temperature in PhoneDisplay");
	}
}
