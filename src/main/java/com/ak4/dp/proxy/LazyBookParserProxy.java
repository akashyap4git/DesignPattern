package com.ak4.dp.proxy;

public class LazyBookParserProxy implements IBookParser {
	
	private String book = null;
	private BookParser bookParser = null;
	
	public LazyBookParserProxy(String book) {
		this.book = book;
	}

	@Override
	public int getNumberOfPages() {
		if(bookParser == null) {
			System.out.println("Creating Book Parser Expensive Object");
			bookParser = new BookParser(book);
		}
		return bookParser.getNumberOfPages();
	}
}
