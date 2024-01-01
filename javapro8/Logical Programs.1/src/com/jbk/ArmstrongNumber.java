//   Q5. Write a program for Armstrong Number. 
//
//       Input – 153
//  Output – 153 is Armstrong number.
//

        package com.jbk;
		public class ArmstrongNumber{
		public static void main(String[] args) {
		
			int number=371;
			int num1=number;
			int counter=0;
			while(num1>0)
			{
				counter++;
				num1=num1/10;
			}
			int num2=number;
			int rem=0;
			int sum=0;
			while(num2>0)
			{
				int mul=1;
				rem=num2%10;
				for(int i=1; i<=counter; i++)
				{
				mul=mul*rem;	
				}
                num2=num2/10;
                sum=sum+mul;
			}
			if(sum==number)
			{
		   System.out.println(number +" is Armstrong number");
			}
			else
			{
				System.out.println("Not Armstrong Number");
			}
	       }		
         }


