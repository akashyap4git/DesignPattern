package com.ak4.dp.templatemethod;

public class TestTemplateMethodPattern {
	
	public static void main(String[] args) {
		LenovoStandardComputer std = new LenovoStandardComputer();
		std.buildComputer();
		System.out.println("Standrad Computer Built Successfully");
		System.out.println("***********");
		LenovoGameComputer game = new LenovoGameComputer();
		game.buildComputer();
		System.out.println("Game Computer Built Successfully");
	}
}
