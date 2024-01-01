
//Q).Find Even Number And Odd Number From Array.

//Input - 90,87,12,76,12,20,76,90.

//Output –
//Even Number From Array- [12, 20]
//Even Number From Array- [23, 43, 45, 89]
 
package com.jbk;
import java.util.ArrayList;
public class EvenOdd {
	public static void main(String[] args) {
		int []arr= {23,12,20,43,45,89};
		ArrayList<Integer> Even =new ArrayList<Integer>();
		ArrayList<Integer> Odd =new ArrayList<Integer>();
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i]%2==0)
			{
				Even.add(arr[i]);
			}
			else
			{
				Odd.add(arr[i]);
			}
		}	
		System.out.println("Even Number From Array->"+Even);
		System.out.println("Even Number From Array->"+Odd);
		
	}
}






