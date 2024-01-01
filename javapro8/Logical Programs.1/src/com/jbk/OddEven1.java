//Q) Find The smallest and second smallest odd Element from Array.

//Input - Sorting Array
//33 16 14 12 12 10 9 8 7 6 4 2
//Output - min Value of array->
//First Smallest odd Number From an Array:7
//Second Smallest odd Number From an Array:9


package com.jbk;

public class OddEven1 {
	public static void main(String[] args) {
		int arr[]= {12,14,2,33,4,16,6,7,8,9,10,12};
		int temp=0;
		int a=0;
		int []arr1 = new int[arr.length];
		for(int i=0; i<=arr.length-1; i++)
		{
			for(int j=i+1; j<=arr.length-1; j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorting Array");
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.println(arr[i]);
			if(arr[i]%2!=0)
			{
				arr1[a]=arr[i];
				a++;
			}	
		}
		System.out.println("*******************");
		System.out.println("First Smallest odd Number From an Array:"+arr1[0]);
		System.out.println("Second Smallest odd Number From an Array:"+arr1[1]);
	}
}





