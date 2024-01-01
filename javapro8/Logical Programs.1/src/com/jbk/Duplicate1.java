//Q). Find Duplicate Element from Array.
//Input - 1,2,1,3,4,1,2,1,5
//Output- 2 1 

package com.jbk;

public class Duplicate1 {

	public static void main(String[] args){

		int []arr= {1,2,1,3,4,1,2,1,5};
    System.out.println("Find Duplicate element from array");
		for (int i = 0; i <=arr.length-1; i++)
		{
			int counter=0;
			for (int j = i+1; j <=arr.length-1; j++)
			{
				if(arr[i]==arr[j])
				{
					counter++;
				}
			}
			if(counter==1)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
