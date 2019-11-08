package com.ak4.dp.proxy;

public class BookParser implements IBookParser {

	int numberOfPages = 0;
	
	public BookParser(String book) {
		this.numberOfPages = countNumberOfPages(book);
	}
	
	private int countNumberOfPages(String book) {
		//Complex logic to perform to determine no of pages of book content
		//Hence hardcoding number of pages with Math lib
		return (int) (Math.random()*((2000-500)+1))+500; 
	}

	@Override
	public int getNumberOfPages() {
		return numberOfPages;
	}
}
