package com.ak4.dp.factorymethod;

public class CreateCarCommandImpl implements CreateCarCommand {
	
	CarFactory carFactory;

	public CreateCarCommandImpl(CarFactory carFactory) {
		this.carFactory = carFactory;
	}
	@Override
	public Car execute(CarType carType) {
		return carFactory.buildCar(carType);
	}
}
