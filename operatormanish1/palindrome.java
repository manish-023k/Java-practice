package operatormanish1;

import java.util.Scanner;

public class palindrome 
{
	public static String pal(int m)
	{
		int x=0,y=m;
		while(m!=0)
		{
			x=x*10+m%10; //reverse of number
			m=m/10;
		}
		if(y==x) //compare reverse with number 
		return("palindrome");
		else
			return("no");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		
		System.out.println(pal(num));

	}

}
