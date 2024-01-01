//Q10 Draw Pattern
//      *
//     * *
//    *   *
//   *     *
//  * * * * *

package com.jbk;

public class Star10 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(" ");	
			}
			for(int k=1; k<=i; k++)
			{
			if(k==2 && i==3 || k==3 && i==4 || k==2&&i==4)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print(" *");
				}		
			}
			System.out.println();
		}	
	}
}








