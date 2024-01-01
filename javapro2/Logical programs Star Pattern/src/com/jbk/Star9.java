//Q9 Draw Pattern
//
//           *
//         * * *
//       * * * * *
//     * * * * * * *
//   * * * * * * * * *

package com.jbk;
public class Star9 {
	public static void main(String[] args) 
	{
		for(int i=1; i<=10; i+=2)
		{
			for(int j=10; j>=i; j-=2)
			{
				System.out.print("  ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
