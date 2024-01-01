//Q). Find Duplicate Element & Unique Element From Array.
//Input -  {11,11,2,3,3,4,4}

//Ouptput  -

 //Duplicate Element:
//11
//3
//4
//Unique Element:
//2

package com.jbk;

public class Array {
	public static void main(String[] args) {
		int arr[]= {11,11,2,3,3,4,4};
		int visited=0;
		System.out.println("Duplicate Element:");
		for(int i=0; i<=arr.length-1; i++) 
		{
		  for(int j=i+1; j<=arr.length-1; j++)
		   {
			if(arr[i]==arr[j]&& arr[i]!=0)
			 {
			  visited=arr[i];
				System.out.println(visited);
		            for (int k = 0; k <=arr.length-1; k++)
				   {
					if(arr[k]==visited)
					  {
						arr[k]=0;
					  }	
				    }			
				}	
			}		
		}
		System.out.println("Unique Element:");
		for(int p=0; p<=arr.length-1; p++)
		{
			if(arr[p]!=0)
			System.out.println(arr[p]);
		}
	}
}

