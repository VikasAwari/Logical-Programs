//Q6 Draw Pattern
// # * # * #
// # * # * #
// # * # * #
// # * # * #
// # * # * #

package com.jbk;
public class Star6 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
	     {
		for(int j=1; j<=5; j++)
		   {
			if(j%2==0)
			{
				System.out.print(" *");
			}
			else
			{
				System.out.print(" #");
			}
		 }
		System.out.println();
	 }
   }
}


