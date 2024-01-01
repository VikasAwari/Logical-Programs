//Q8. Write a program for find Prime Number Between 1 to 100. 
    // Input – 100
//Output – 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97

		package com.jbk;
		public class Reverse2{
		public static void main(String[] args) {

			int number=100;
			for(int i=1; i<=number; i++)
			{
				int counter=0;
				for(int j=1; j<=number; j++)
				{
					if(i%j==0)
					{
						counter++;	
					}
				}
				if(counter==2)
				{
					System.out.println(i);
				}
			   }	
	           }		
              }

