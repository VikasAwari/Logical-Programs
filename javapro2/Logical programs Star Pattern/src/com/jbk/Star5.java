//5. Draw the Pattern-
//   * * * * *
//    * * * *
//     * * *
//      * *
//       *
      
package com.jbk;
public class Star5 {
	public static void main(String[] args) {
		int counter=5;
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=counter-i; j--)
			{
				System.out.print(" ");
			}
			 for(int k=5; k>=i; k--)
			 {
				 System.out.print(" *");
			 }
			 System.out.println();
		}	
	}
}
