//Q) Draw Pattern.
//Enter The Number->
//6
//1 
//2 2 
//3 3 3 
//5 5 5 5 5 
//8 8 8 8 8 8 8 8 
//13 13 13 13 13 13 13 13 13 13 13 13 13 

package com.jbk;

import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number->");
		int num=sc.nextInt();
		int a=0; 
		int b=1; 
		int c=0;
		for(int i=1; i<=num; i++)
		{
			c=a+b;
			for(int j=1; j<=c; j++)
			{
				System.out.print(c+" ");
			}
			a=b;
			b=c;
			c=a;
			System.out.println();
		}	
	}
}
