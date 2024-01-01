//Q14 Draw Pattern.
// 1
// 2 6
// 3 7 10
// 4 8 11 13
// 5 9 12 14 15

package com.jbk;

public class P17 {
	public static void main(String[] args) {
	
		int num=1;
		for(int i=1; i<=5; i++)
		{
			int temp=num;
			for(int j=1; j<=num; j++)
			{
				System.out.print(" "+temp);
				temp=temp+5-j;
			}
			System.out.println();
			num++;
		}
	}
}





