//Q14 Draw Pattern.
//          1 
//        2 1 2 
//      3 2 1 2 3 
//    4 3 2 1 2 3 4 
//  5 4 3 2 1 2 3 4 5 

package com.jbk;

public class P15 {
	public static void main(String[] args) {
		
		for(int i=1,x=2; i<=5; i++,x++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print("  ");
			}
			for(int k=0; k<i; k++)
			{
			System.out.print((i-k)+" ");
			}
			for(int k=2; k<x; k++)
			{
		     System.out.print(k+" ");
			}

			System.out.println();
		}
		
	  }
    }



