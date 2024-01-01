//Q3.Write a program for Fibonacci series. 
//     Input – a=0 b=1 c=0
//     Output – 0 1 1 2 3 5 8 13 21 34 55 89

		
			package com.jbk;
			public class Fibbo {
			public static void main(String[] args) {
				int a=0; 
				int b=1;
					System.out.println(a);
						for(int i=1; i<=10; i++)
						{
						int c=a+b;
						System.out.println(c);
						a=b; 
						b=c;	
}
			}
			}