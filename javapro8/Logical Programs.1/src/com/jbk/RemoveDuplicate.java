//Q). Remoe Array Element From Unsorted Array.

//Input – 90,20,93,12,12,78,78,90,90,20.

//Output – 12,20,78,90,93.

package com.jbk;

public class RemoveDuplicate {
	public static void main(String[] args) {

		int [] arr={90,20,93,12,12,78,78,90,90,20};
		int temp1=0;
		for (int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<=arr.length-1; j++)
			{
				if(arr[i]>=arr[j])
				{
					temp1=arr[i];
					arr[i]=arr[j];
					arr[j]=temp1;
				}
			}
		}
		int temp[]=new int[arr.length];
		int j=0;
		for (int i=0; i<arr.length-1; i++) 
		{
			if (arr[i]!=arr[i+1])
			{
				temp[j]=arr[i];
				j++;
			}
		}
		temp[j]=arr[arr.length-1];
		for (int k = 0; k <= temp.length - 1; k++)
		{
			if (temp[k]!=0)
			{
				System.out.println(temp[k]);
			}
		}

	}
}



