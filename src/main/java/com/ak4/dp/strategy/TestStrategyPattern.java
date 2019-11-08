package com.ak4.dp.strategy;

public class TestStrategyPattern {
	
	public static void main(String[] args) {
		Duck wildDuck = new WildDuck();
		wildDuck.setQuackBehavior(new Quack());
		wildDuck.setFlyBehavior(new FlyWithWings());
		wildDuck.display();
		wildDuck.swim();
		wildDuck.performQuack();
		wildDuck.performFly();
		
		System.out.println("######################");
		Duck cityDuck = new CityDuck();
		cityDuck.setQuackBehavior(new Quack());
		cityDuck.setFlyBehavior(new FlyWithWings());
		cityDuck.display();
		cityDuck.swim();
		cityDuck.performQuack();
		cityDuck.performFly();

		System.out.println("######################");
		Duck rubberDuck = new RubberDuck();
		rubberDuck.setQuackBehavior(new Squeak());
		rubberDuck.setFlyBehavior(new FlyNoWay());
		rubberDuck.display();
		rubberDuck.swim();
		rubberDuck.performQuack();
		rubberDuck.performFly();

		System.out.println("######################");
		Duck woodenDuck = new WoodenDuck();
		woodenDuck.setQuackBehavior(new MuteQuack());
		woodenDuck.setFlyBehavior(new FlyNoWay());
		woodenDuck.display();
		woodenDuck.swim();		
		woodenDuck.performQuack();
		woodenDuck.performFly();
	}
}
