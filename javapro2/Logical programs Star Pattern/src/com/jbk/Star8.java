//Q8 Draw Pattern
//
// * * * * *
//   * * * *
//     * * *
//       * *
//         *

package com.jbk;

public class Star8 {
	public static void main(String[] args) {
		for(int i=5; i>=1; i--)
		{
			int counter=5;
			for(int j=1; j<=counter-i; j++)
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

