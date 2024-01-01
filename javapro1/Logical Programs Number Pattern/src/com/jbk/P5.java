//Q) Draw Pattern.
// A
 //B C
 //D E F
 //G H I J
 //K L M N O
 //P Q R S T U

package com.jbk;

public class P5 {
	public static void main(String[] args) {
		char ch='A';
		for(char i=1; i<=6; i++)
		{
			for(char j=1; j<=i; j++)
			{
				System.out.print(" "+ch++);
			}
			System.out.println();
		}	
	}
}




