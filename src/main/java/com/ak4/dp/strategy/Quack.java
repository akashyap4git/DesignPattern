package com.ak4.dp.strategy;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quacking....");
	}
}
