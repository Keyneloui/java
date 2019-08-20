package com.day3;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		ArrayList<String> bookList = new ArrayList<String>();
        bookList.add("Head First Java");
        bookList.add("Programming C");
        bookList.add("Data Structures");
        bookList.add("Head First Java");
        
        System.out.println(bookList.get(0));
        System.out.println(bookList.size());
        System.out.println(bookList.contains("Head First Java"));
        bookList.remove("Programming C");
        
        for(String bookName: bookList) {
            System.out.println(bookName);
        }
	}

}
