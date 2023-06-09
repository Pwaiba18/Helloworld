package com.nepal;

public class SwapNumber {

	public static void main(String[] args) {
		int first=20;
		int second=30;
		System.out.println("Before Swap");
		System.out.println("First value: " + first);
		System.out.println("Second value: " + second);
		
		int temp = first;
		first = second;
		second = temp;
		System.out.println("After Swap");
		System.out.println("First value: " +first);
		System.out.println("Second value: " +second);
		
		
	}
	
	
}
