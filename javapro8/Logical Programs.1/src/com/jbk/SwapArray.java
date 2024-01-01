
//Q). Swap Array Element From Array.

//Input – 1,2,3,4,5.
//Output –4,5,1,2,3.

package com.jbk;

public class SwapArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		System.out.print(arr.length-1+" ");
		System.out.print(arr.length+" ");
		for(int i=0; i<arr.length-2; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}

