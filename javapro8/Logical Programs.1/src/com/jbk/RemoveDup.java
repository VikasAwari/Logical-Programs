//Q). Remoe Duplicate Element From Sorted Array.

//Input – 12,12,45,90,20,98,98.

//Output – 12,45,90,20,98.

package com.jbk;

public class RemoveDup {

	public static void main(String[] args) {

		int arr[]= {12,12,45,90,20,98,98};
		int []temp=new int[arr.length];
		int j=0;
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i] != arr[i+1])
			{
				temp[j]=arr[i];
				j++;
			}
		}
		temp[j]=arr[arr.length-1];		
		
		for(int k=0; k<=temp.length-1; k++)
		{
			if(temp[k]!=0)
			{
				System.out.println(temp[k]);
			}	
		}
	}
}
