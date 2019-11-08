package com.ak4.dp.observer;

public class WatchDisplay implements Observer {
	
	private Observable observable;
	
	public WatchDisplay(Observable observable) {
		this.observable = observable;
	}

	@Override
	public void update() {
		int currentTemp = observable.getTemperature();
		System.out.println(currentTemp + " temperature in WatchDisplay");
	}
}
