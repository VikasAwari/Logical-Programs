//Q8. Write a program for Below pattern.
     
//Output-
//1234567654321
//123456 654321
//12345   54321
//1234     4321
//123       321
//12         21
//1           1

package com.jbk;

public class P20 {
	public static void main(String[] args) { 
		    int rows=7;
		    for (int i = 7; i >= 1; i--)
		    {
			for (int j = 1; j <= i; j++)
			  {
				System.out.print(j);
			  }
			for (int j = 2; j <= 2 * (rows - i); j++)
			  {
                System.out.print(" ");
              }  
		    for (int j = i; j >= 1; j--) 
			  {
		    	if(j==7)
		    	{
		    		System.out.print("");
		    	}
		    	else
		    	{
		    		System.out.print(j);	
		    	}  
			  }
			  System.out.println(); 
	     }
	}
}


