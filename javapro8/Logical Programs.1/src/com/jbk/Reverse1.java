//Q7. Write a program for Reverse Number. 
//         		Input – 1298 
//   		Output – 8921
	 	
		package com.jbk;
		public class Reverse1{
		public static void main(String[] args) {
		
			int number=1298;
			int rem,rev=0;
			while(number>0)
			{
				rem=number%10;
				rev=rev*10+rem;
				number=number/10;	
			}
			System.out.println("Reverse Number is:"+ rev);	
	       }	
		}

