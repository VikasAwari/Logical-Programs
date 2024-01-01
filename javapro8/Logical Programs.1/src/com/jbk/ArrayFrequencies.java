//Q).Find The Frequencies of An Array Elemens.

//Input – 12,56,12,45,56,55,23,12,78,56,45.
//Output - 55=1, 23=1, 56=3, 12=3, 45=2, 78=1

package com.jbk;
import java.util.HashMap;
public class ArrayFrequencies {
	public static void main(String[] args) {	
		int arr[]= {12,56,12,45,56,55,23,12,78,56,45};
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
			for(int i=0; i<=arr.length-1; i++)
			{
				if(hm.containsKey(arr[i]))
				{
					hm.put(arr[i], hm.get(arr[i])+1);
				}
				else
				{
					hm.put(arr[i], 1);
				}
			 }
			System.out.println(hm);
		  }
		}




