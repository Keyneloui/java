package com.revature;

public class TestUtilAddition1 {

	public static void main(String[] args) {
		testValidNumber();
		testNegativeNumber();
		testAdditionWithZero();

	}

	private static void testValidNumber() {
		System.out.println("Testing Valid Numbers");
		TestUtilAddition1 additionUtil = new TestUtilAddition1();
		int result = additionUtil.add(2, 3);
		System.out.println(result);
	}

	private static void testNegativeNumber() {
		System.out.println("Testing Negative Numbers");
		TestUtilAddition1 additionUtil = new TestUtilAddition1();
		int result = additionUtil.add(-2, -3);
		System.out.println(result);
	}

	private static void testAdditionWithZero() {
		System.out.println("Testing Negative Numbers");
		TestUtilAddition1 additionUtil = new TestUtilAddition1();
		//inputs
		int result = additionUtil.add(0, -3);
		//outputs
		System.out.println(result);
	}
	public int add(int a, int b) {

		// Business Logic
		int c = a + b;
		return c;
	}

}
