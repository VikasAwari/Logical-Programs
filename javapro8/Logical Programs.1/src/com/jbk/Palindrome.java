//Q6. Write a program for Palindrome Number. 
//
//         		Input – 121 
//   		Output – Palindrome Number.

		package com.jbk;

		public class Palindrome{
		public static void main(String[] args) {
		
			int number=121;
			int num1=number;
			int rev=0;
			int rem=0;
			while(num1>0)
			{
				rem=num1%10;
				rev=rev*10+rem;
				num1=num1/10;	
			}
			if(rev==number)
			{
				System.out.println("Palindrome Number");
			}
		}
		}
