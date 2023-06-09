package com.nepal;


import java.util.Scanner;

// 0 1 1 2 3 5 8 13
// adding last two digit is fibonacci series

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int term,a=0,b=1,c;
		System.out.print("enter term");
		Scanner r=new Scanner(System.in);
		term=r.nextInt();
		for(int i=1;i<=term; i++) {
			System.out.print(a+ " ");
			c=a+b;
			a=b;
			b=c;
		}
	}
	
}
