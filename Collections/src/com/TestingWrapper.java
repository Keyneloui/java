package com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class TestingWrapper {

	public static void main(String[] args) {
		HashSet<String>book=new HashSet<String>();
		book.add("Hash");
		book.add("Renuka");
		book.add("Hash");
		book.add("Krithika");
		
		for(String Author:book)
		{
		 System.out.println(Author);
		
		

	}
		
		TreeSet<Integer>prices=new TreeSet<Integer>();
		prices.add(100);
		prices.add(200);
		prices.add(50);
		prices.add(200);
		prices.add(25);
		System.out.println(prices);
		
		HashMap<String,Integer>Booking=new HashMap<String,Integer>();
		Booking.put("C", 450);
		Booking.put("B", 120);
		Booking.put("Adams", 340);
		System.out.println(Booking);

}
}
