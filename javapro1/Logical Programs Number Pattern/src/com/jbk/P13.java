//Q).  Draw Pattern.

// 6 8 7 9 5 4 3 2 1
// 8 7 6 5 4 3 2 1
// 7 6 5 4 3 2 1
// 6 5 4 3 2 1
// 5 4 3 2 1
// 4 3 2 1
// 3 2 1
// 2 1
// 1



package com.jbk;

public class P13 {

	public static void main(String[] args) {
		
			for(int i=9; i>=1; i--)
			{
				for(int j=i; j>=1; j--)
				{
					if(i==9 && j==9)
					{
						System.out.print(" 6");
					}
					else if(i==9 && j==6)
					{
						System.out.print(" 9");
					}
					else
					{
					    System.out.print(" "+j);
					}	
				}
				System.out.println();
			 }
	         }
       }





