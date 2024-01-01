//Q4.Write a program for sum of digit. 
//     Input – 1 2 3
//     Output – 6
//
      	package com.jbk;

		public class SumOfDigit{
		public static void main(String[] args) {
		
			int number=123;
			int sum=0;	
			int rem=0;
			while(number>0)
			{
				rem=number%10;
				sum=sum+rem;
				number=number/10;
			}
		System.out.println("sum of number is : "+sum);
	 	 }		
		}
		
