package com.ak4.dp.strategy;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Not Quacking....");
	}
}
