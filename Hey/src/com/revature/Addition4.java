package com.revature;

public class Addition4 {

	public static void main(String[] args) {
		Addition4 obj=new Addition4();
		int c=obj.add(3, 6);
		System.out.println(c);
		
	}
	public int add(int a,int b) {
		int c=a+b;
		return c;
	}

}
