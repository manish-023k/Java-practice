package operatormanish1;

import java.util.Scanner;

public class check 
{
	public static String checknum(int num1,int num2)
	{
		if(num2>num1)
			return("true");
		else if(num1>num2)
			return("false");
		else
			return("-1");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in); //create object of scanner class to take input from user
		int n1=in.nextInt();
		int n2=in.nextInt();
		System.out.println(checknum(n1,n2));

	}
	

}
