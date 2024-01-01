//Q1 Reverse String Program.
//Input – Programming.
//Ouptput  - Reverse String->  gnimmargorP

package com.jbk;

public class ReverseString{
	public static void main(String[] args) {
		String s1="Programming";
		String s2="";
		for(int i=s1.length()-1; i>=0; i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println("Reverse String-> "+s2);
	}
}



