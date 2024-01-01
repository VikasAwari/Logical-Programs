// Q16 Draw Pattern.
//
//	EDCBA
// 	 DCBA
//    CBA
//     BA
//      A
     

package com.jbk;

public class P18{

	public static void main(String[] args) {
		int k=5;
		for(char i=70; i>=65; i--)
		{
			
			for(char j=69; j>=i;j--)
			{
				System.out.print(" ");
			}
			for(char j=1; j<=k;j++)
			{
				System.out.print((char)(i-j));	
			}
			k--;
			System.out.println();
		}
	}

}
