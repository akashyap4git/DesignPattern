package com.ak4.dp.proxy;

public class TestProxyPattern {
	
	public static void main(String[] args) {
		String book = "Head First Design Pattern";
		LazyBookParserProxy parser = new LazyBookParserProxy(book);
		System.out.println(parser.getNumberOfPages());
		System.out.println(parser.getNumberOfPages());
		System.out.println(parser.getNumberOfPages());
		System.out.println(parser.getNumberOfPages());
		System.out.println(parser.getNumberOfPages());
	}
}
