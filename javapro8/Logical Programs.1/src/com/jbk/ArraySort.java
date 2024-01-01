//Q1 Sort in Assending Order-

//Input  - 3,89,12,67,88,4,12

//Output – 3,4,12,12,67,88,89	


package com.jbk;

public class ArraySort {
	public static void main(String[] args) {
		int a[]= {3,89,12,67,88,4,12};
		for(int i=0; i<a.length-1; i++)
		{
			int temp;
			for(int j=i+1; j<=a.length-1; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sort in Assending Order->>");
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.print (a[i]+" ");
		}
	}
	}														



