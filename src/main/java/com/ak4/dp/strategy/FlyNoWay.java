package com.ak4.dp.strategy;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Not Flying....");	
	}
}
