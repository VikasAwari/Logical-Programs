//Q4 Find The Min Element From Array.

//Input - 73,87,90,3,520,43.

//Output - min Value of array->3


package com.jbk;

public class Min {
	public static void main(String[] args) {

		int []arr= {73,87,90,3,520,43};
		int min=arr[0];
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i]<min)
             {
	          min=arr[i];
             }
		}
		System.out.println("Min Value of array->"+min);
	}
}






