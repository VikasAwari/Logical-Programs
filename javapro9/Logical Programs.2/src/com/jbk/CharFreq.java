//Q4. Find Character With Frequencies.
//Input – Hello
//
//Ouptput  - H:1  e:1  l:2  o:1

package com.jbk;

public class CharFreq {

	public static void main(String[] args) {
		
		String str="Java Program";
		char []ch=str.toCharArray();
		for(int i=0; i<=str.length()-1; i++)
		{
			int cnt=1;	
			for(int j=i+1; j<=str.length()-1; j++)
			{
				if(ch[i]==ch[j])
				{
					cnt++;
					ch[j]=' ';
				}
			}
			if(ch[i]!=' ')
				System.out.println(ch[i]+":"+cnt);
		}	
	}
}

