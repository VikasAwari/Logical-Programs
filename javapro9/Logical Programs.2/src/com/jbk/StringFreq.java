//Q5. Find String Array With Frequencies.
//Input -  {"java", "python","php","rubby","java","php","java"}
//
//Ouptput  - java : 3 python :  1 php : 2  rubby : 1
//
package com.jbk;

public class StringFreq {

public static void main(String[] args) {
		
String str[]={"java","python","php","rubby","java","php","java"};
		for(int i=0; i<=str.length-1; i++)
		{
			int counter=1;
			for(int j=i+1; j<=str.length-1; j++)
			{
				if(str[i]==str[j])
				{
					counter++;
					str[j]=" ";
				}
			}
			if(str[i]!=" ")
			System.out.println(str[i]+" : "+counter);
		}
	}
}




