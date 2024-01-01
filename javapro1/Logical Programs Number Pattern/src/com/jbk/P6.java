//Q). Draw Pattern.
 //   A
 //  A B
 // A B C
 //A B C D
//A B C D E

package com.jbk;

public class P6 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(" ");
			}
			char ch='A';
			for(char k=1; k<=i; k++)
			{
				System.out.print(" "+ch++);
			}
			System.out.println();
		}	
	}
}


