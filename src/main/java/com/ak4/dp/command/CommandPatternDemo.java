package com.ak4.dp.command;

public class CommandPatternDemo {
	
	public static void main(String[] args) {
		System.out.println("Getting sum of sequence of " + sumOfFunction(1, 100, new Function() {
			
			@Override
			public int apply(int i) {
				return i;
			}
		}));
		System.out.println("Getting sum of square of " + sumOfFunction(1, 10, new Function() {
			
			@Override
			public int apply(int i) {
				// TODO Auto-generated method stub
				return i*i;
			}
		}));
	}
	
	private static int sumOfFunction(int lower, int upper, Function f) {
		int sum = 0;
		for(int i=lower; i<=upper; i++) {
			sum += f.apply(i);
		}
		return sum;
	}
}

interface Function {
	public int apply(int i);
}
