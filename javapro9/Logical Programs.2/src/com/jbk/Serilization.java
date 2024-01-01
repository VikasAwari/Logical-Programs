//Q4. Write a program of reverse String with split method. 
//Input: Java By Kiran
//Output: Kiran By Java

package com.jbk;

public class Serilization {

	public static void main(String[] args) {
	
		String s="Java By Kiran";
		String str1[]=s.split(" ");
		
		for (int i = str1.length-1; i >=0; i--) 
		{
			System.out.println(str1[i]);
		}
	  }
   }


