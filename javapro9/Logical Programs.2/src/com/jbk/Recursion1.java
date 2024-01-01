//Q1) Sum of Digit Program using Recursion
//
//Input : 1 2 3 4 
//Output : 10
//

package com.jbk;

public class Recursion1 {
	
	public static int sumOfDigit(int number)
	{
		if(number==0)
		{
			return 0;
		}
		else
		{
			return number%10+sumOfDigit(number/10);
		}
	}
	
public static void main(String[] args) {
	
	int number=1234;
	System.out.println("Sum Of Digit : "+(sumOfDigit(number)));	
   }
}

