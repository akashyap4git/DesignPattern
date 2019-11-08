package com.ak4.dp.factorymethod;

public interface CreateCarCommand {

	public Car execute(CarType carType);
}
