package operatormanish1;

import java.util.Scanner;

public class fibnocci {
	public static void fibb(int n) 
	{
		int a=0,b=1;
		int c;
		if(n==1)
			System.out.println(a); //print 0 if n==1
		else if(n==2)
		{
			System.out.println(a);
			System.out.println(b);  //print 0,1,1 because 0,1 is less than 2
			System.out.println(a+b);
		}
		else
		{
			System.out.print(a+" "+b);
			while(true)
			{
				c=a+b;
				if(c>n) //run when series number > user number
					break; // to stop infinite loop
				System.out.print(" "+c);
				a=b;
				b=c;
			
				
			}
			
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		System.out.println("enter the value :");
		int num=in.nextInt();
		/*int a=0,b=1;
		System.out.print(a+" "+b);
		for(int i=2;i<=n;i++)
		{
			int c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}*/
		fibb(num);

	}

}
