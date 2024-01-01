//  Q14 Draw Pattern.
//
// 54321
//  4321
//   321
//    21
//     1


package com.jbk;

public class P16 {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=6; k>i; k--)
			{
				System.out.print(k-i);
				
			}
			System.out.println();
		}
		
	  }
    }

