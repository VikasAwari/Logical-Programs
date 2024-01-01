package com.jbk;
//Q3  Find Vowels And Consonant String Program.
//Input – NITIN.
//Ouptput  - String is Palindrome
//package com.jbk;

public class Vowels {

	public static void main(String[] args) {
		 
		String str="String";
		String vowels="";
		String consolent="";
		for(int i=0; i<=str.length()-1; i++)
		{
			char ch=str.charAt(i);
		
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
			  vowels=vowels+ch;
			}
			else
			{
				consolent=consolent+ch;
			}
		
		}
		System.out.println("Vowels Are->"+vowels);
		System.out.println("Consolunt Are->"+consolent);
	}
}




