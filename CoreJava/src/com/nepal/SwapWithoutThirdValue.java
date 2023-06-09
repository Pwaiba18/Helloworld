package com.nepal;

public class SwapWithoutThirdValue {

public static void main(String[] args) {
	
	int first=20;
	int second=30;
	System.out.println("Before Swap");
	System.out.println("First value: " + first);
	System.out.println("Second value: " + second);
	
	first = first - second;
	second = first + second;
	first = second - first;
	System.out.println("After Swap");
	System.out.println("First value: " +first);
	System.out.println("Second value: " +second);
	
	
}	
	
	
}
