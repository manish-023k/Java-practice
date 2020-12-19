package operatormanish1;

import java.util.Scanner;

public class prime 

{
	public static void prm1(int count)
	{
		int count1=1;
		for(int i=1;i<=100;i++)
		{
			if(prm(i)=="prime number") // give the prime number 
			{
				if(count1>count) // hrere we compare the i from pattren1 to the count1
					break;
				else
				{
				System.out.print(i+" ");
				count1++;
				}
			}
			
		}
	}
	public static String prm(int m)
	{
		int flag=0;
		/*if(m==1)
	      return("not prime number");*/
		for(int i=2;i<=m/2;i++) //taking m/2 to decrease no of itreation
		{
			if(m%i==0)
			{
				flag=1; 
				break;
			}
		}
		if(flag==0)
			return("prime number");
		else
			return("not prime number");
	}
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the value :");
		int num=in.nextInt();
		System.out.println(prm(num));
		//prm1();
		
	}

}
