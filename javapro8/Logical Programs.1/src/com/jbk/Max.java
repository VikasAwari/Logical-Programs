
//Q3 Find The Max Element From Array.

//Input - 73,87,90,3,520,43.

//Output - Max Value of array->520

package com.jbk;

public class Max {
	public static void main(String[] args) {

		int []arr= {73,87,90,3,520,43};
		int max=arr[0];
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i]>max)
             {
	          max=arr[i];
             }
		}
		System.out.println("Max Value of array->"+max);
	}
}






