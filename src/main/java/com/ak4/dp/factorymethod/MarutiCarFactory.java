package com.ak4.dp.factorymethod;

public class MarutiCarFactory extends CarFactory {

	@Override
	public Car buildCar(CarType carType) {
		System.out.println("Building Maruti Car");
		Car car = null;

		switch(carType) {
		case HATCHBACK:
			car = new HatchbackCar();
			car.setCarCompany("Maruti");
			car.setCarType(carType.name());
			break;

		case SEDAN:
			car = new SedanCar();
			car.setCarCompany("Maruti");
			car.setCarType(carType.name());
			break;

		case SUV:
			car = new SUVCar();
			car.setCarCompany("Maruti");
			car.setCarType(carType.name());
			break;

		default:
			throw new RuntimeException("Invalid Car Type");
		}
		return car;
	}

}
