//Q). Find Unique Element from Array.
//Input – arr1{11,12,13}, arr2{11,12,13}
//Output- Both Array are equals.


package com.jbk;

public class Serilization {

	public static void main(String[] args) {
		int arr1[]= {11,12,13};
		int arr2[]= {11,12,13};
		int counter=0;
		for(int i=0; i<=arr1.length-1; i++)
		{
			for(int j=0; j<=arr2.length-1; j++)
			{
				if(arr1[i]==arr2[j])
				{
					counter++;
				}
			}
		}
			if(counter==arr1.length && counter==arr2.length)
			{
				System.out.println("Both array equals");
			}
			else
			{
				System.out.println("Both array not equals");
			}
	     }
     }
