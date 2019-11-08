package com.ak4.dp.composite;

public class TestCompositePattern {
	
	public static void main(String[] args) {
		Shape triangle1 = new Triangle();
		Shape triangle2 = new Triangle();
		Shape circle1 = new Circle();
		
		Drawing drawing = new Drawing();
		drawing.add(triangle1);
		drawing.add(triangle2);
		drawing.add(circle1);
		
		drawing.draw("RED");
	}

}
