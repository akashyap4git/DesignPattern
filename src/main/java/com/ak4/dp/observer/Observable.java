package com.ak4.dp.observer;

public interface Observable {
	
	public void register(Observer observer);
	
	public void unregister(Observer observer);
	
	public void notifyChange();
	
	public int getTemperature();

}
