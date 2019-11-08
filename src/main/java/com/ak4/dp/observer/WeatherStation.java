package com.ak4.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {
	
	private Integer temperature;

	private List<Observer> observers = new ArrayList<>();
	
	@Override
	public void register(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unregister(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyChange() {
		for(Observer o : observers) {
			o.update();
		}
	}

	@Override
	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}
}
