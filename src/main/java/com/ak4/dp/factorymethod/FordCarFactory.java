package com.ak4.dp.factorymethod;

public class FordCarFactory extends CarFactory {

	@Override
	public Car buildCar(CarType carType) {
		System.out.println("Building Ford Car");
		Car car = null;

		switch(carType) {
		case HATCHBACK:
			car = new HatchbackCar();
			car.setCarCompany("Ford");
			car.setCarType(carType.name());
			break;

		case SEDAN:
			car = new SedanCar();
			car.setCarCompany("Ford");
			car.setCarType(carType.name());
			break;

		case SUV:
			car = new SUVCar();
			car.setCarCompany("Ford");
			car.setCarType(carType.name());
			break;

		default:
			throw new RuntimeException("Invalid Car Type");
		}
		return car;
	}
}
