package operatormanish1;

import java.util.Scanner;

public class amstrong 
{
	public static int amstng(int num)
	{
		int len=0,res=1,fin=0;
		int rem,m=num;
		while(m!=0)
		{
			len=len+1; //find len of number
			m=m/10;
		}
		//System.out.println(len);
		while(num!=0)
		{
			rem=num%10; // to find the digit of number
			//System.out.println(rem);
			num=num/10;
			for(int i=1;i<=len;i++)
			{
			       res=res*rem; //find the power of digit of number
			}
			//System.out.println(res);
			fin=fin+res;
			res=1; // here res=1 mean to ignore the garbage value
			
		}
		//System.out.println(fin);
		return(fin);
	}
	
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the value :");
		int n=in.nextInt();
		int com=amstng(n); 
		if(n==com)
			System.out.println("amstrong number ");
		else
			System.out.println("not amstrong number");
		
		
	}

}
