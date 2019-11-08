package com.ak4.dp.strategy;

public abstract class Duck {
		
	private QuackBehavior quackBehavior;
	
	private FlyBehavior flyBehavior;

	public void swim() {
		System.out.println("Swimming....");
	}
	
	public abstract void display();
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
}
