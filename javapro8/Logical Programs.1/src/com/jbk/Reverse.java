//Q Reverse The Array.

//Input - 73,87,90,3,520,43.

//Output - 43 520 3 90 87 73

package com.jbk;

public class Reverse {
	public static void main(String[] args) {

		int []arr= {73,87,90,3,520,43};
		System.out.println("Reverse the array");
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(" "+arr[i]);
			
		}
	}


}
