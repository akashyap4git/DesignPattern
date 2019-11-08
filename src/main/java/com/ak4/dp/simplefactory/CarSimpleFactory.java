package com.ak4.dp.simplefactory;

public class CarSimpleFactory {

	public static Car buildCar(CarType model) {
		Car car = null;

		switch(model) {
		case HATCHBACK:
			car = new HatchbackCar();
			break;

		case SEDAN:
			car = new SedanCar();
			break;

		case SUV:
			car = new SUVCar();
			break;

		default:
			throw new RuntimeException("Invalid Car Type");
		}
		return car;
	}
}
