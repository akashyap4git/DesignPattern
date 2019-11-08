package com.ak4.dp.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

	private List<Shape> shapes = new ArrayList();
	
	public void draw(String fillColor) {
		for(Shape s : shapes) {
			s.draw(fillColor);
		}
	}
	
	public void add(Shape s) {
		this.shapes.add(s);
	}
	
	public void remove(Shape s) {
		this.shapes.remove(s);
	}
	
	public void clear() {
		System.out.println("Clearing all the shapes from drawing");
		this.shapes.clear();
	}
}
