//Q1. Write a program to for prime number.
//
//Input – 5
//Output Number is prime


		package com.jbk;

		public class Prime{
		public static void main(String[] args) {
			int number=17;
		     	int counter=0;
			for(int i=1; i<=number; i++)
			{
				if(number%i==0)
				{
				counter++;
				}
			}
		if(counter==2)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}	
	    }
	}

