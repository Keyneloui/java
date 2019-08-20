package com.day3;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Keyne");
		arr.add("helo");
		
		
		for(Object obj:arr)
		{
			 String bookName = (String) obj;
			System.out.println(obj);
		}
		
	}

}
