//Q) Find Duplicate Elemens From Array.

//Input - 90,87,12,76,12,20,76,90.

//Output - 90 12 76


package com.jbk;

public class Duplicate {
	public static void main(String[] args) {

		int []arr= {90,87,12,76,12,20,76,90};
		for(int i=0; i<=arr.length-1; i++)
		{
			for(int j=i+1; j<=arr.length-1; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(" "+arr[i]);
				}
			}
		}	
	}


}
