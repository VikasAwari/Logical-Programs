//Q) Draw Pattern.

//      A
//     B B
//    C C C
//   D D D D
//  E E E E E

package com.jbk;

public class P7 {
	public static void main(String[] args) {
		char ch='A';
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(" ");
			}
			
			for(char k=1; k<=i; k++)
			{
				System.out.print(" "+ch);
				
			}
			System.out.println();
			ch++;
		}	
	}
}


