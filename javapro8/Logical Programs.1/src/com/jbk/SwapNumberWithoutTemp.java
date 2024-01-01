//Q8. Write a program for Swaping of two number without using    	Third variable.
//     Input – a=10 b=20
//     Output – a=20 b=10


package com.jbk;

public class SwapNumberWithoutTemp{
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
	    a=a+b; 
	    b=a-b;
	    a=a-b;
	    System.out.println(a);
	    System.out.println(b);	
	}
}




