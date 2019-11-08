package com.ak4.dp.factorymethod;

public class InvokerCarCreation {
	
	private CreateCarCommand createCarCommand;
	
	public void setCommand(CreateCarCommand createCarCommand, CarType carType) {
		this.createCarCommand = createCarCommand;
	}
	
	public Car orderCar(CarType carType) {
		return createCarCommand.execute(carType);
	}

}
