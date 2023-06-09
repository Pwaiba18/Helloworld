package com.nepal;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,r;
		System.out.print("enter any Number"); 
			
			Scanner ref=new Scanner(System.in);
			n=ref.nextInt();
			while(n>0)
			{
			r=n%10;
			System.out.print(r);
			n=n/10;
		}
		
	}

	}
