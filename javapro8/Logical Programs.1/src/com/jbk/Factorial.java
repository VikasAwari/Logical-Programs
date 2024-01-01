//Q2. Write a program for factorial number
//     Input – 5
//     Output - 120

		package com.jbk;

		public class Factorial{
		public static void main(String[] args) {
		
			int number=5;
			int fact=1;
				for(int i=1; i<=number; i++)
				{
					fact=fact*i;
				}
		 System.out.println("Factorial of "+number +"is -->"+fact);
	
		}
		}
