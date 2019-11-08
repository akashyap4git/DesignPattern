package com.ak4.dp.simplefactory;

public class TestSimpleFactoryPattern {
	
	public static void main(String[] args) {
		Car c = CarSimpleFactory.buildCar(CarType.SEDAN);
	}

}
