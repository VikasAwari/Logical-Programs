//Q1) Factorial of a number using Recursion
//
//Input : 5
//Output : 120



package com.jbk;

public class Recursion {
	
	public static int fact(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1);
		}
	}
	
public static void main(String[] args) {
	
	int n=5;
	System.out.println("Factorial is : "+(fact(n)));	
   }
}



