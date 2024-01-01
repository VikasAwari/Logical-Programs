//Q14 Draw Pattern.
//      1
//     2 1
//    3 2 1
//   4 3 2 1
//  5 4 3 2 1


package com.jbk;

public class P14 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=0; k<i; k++)
			{
				System.out.print(" "+(i-k));
			}
			System.out.println();
	     	}
	        }
       }

