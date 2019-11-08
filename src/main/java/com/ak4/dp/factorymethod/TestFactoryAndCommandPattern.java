package com.ak4.dp.factorymethod;

public class TestFactoryAndCommandPattern {
	
	public static void main(String[] args) {
		CreateCarCommand carCommand = new CreateCarCommandImpl(new FordCarFactory());
		Car car = carCommand.execute(CarType.SEDAN);
		System.out.println(car.getCarCompany());
		System.out.println(car.getCarType());
	}

}
