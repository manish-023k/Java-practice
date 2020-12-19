package operatormanish1;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		//System.out.println();
		boolean ch;
		
		do
		{
			System.out.println("1 for additon :");
			System.out.println("2 for substraction :");
			System.out.println("3 for multiplication :");
			System.out.println("4 for division :");
			System.out.println("enter the value of number :");
			int x=in.nextInt();
			int y=in.nextInt();
			int a,b;
			if(x>y)
			{
				a=x;
				b=y;
				
			}
			else
			{
				a=y;
				b=x;
			}
			System.out.println("enter your choice :");
			int choice=in.nextInt();
			
			switch(choice)
			{
			    case 1:
			    	System.out.println("sum of numbers : "+(a+b));
			    	break;
			    case 2:
			    	System.out.println("substraction of numbers :"+(a-b));
			    	break;
			    case 3:
			    	System.out.println("multiplication of numbers :"+(a*b));
			    	break;
			    case 4:
			    	System.out.println("division of numbers :"+(a/b));
			    	break;
			    	default:
			    		System.out.println("invalid choice :");
			    		break;
			   }
			System.out.println("you want to continous :");
			ch=in.nextBoolean();
			
			
		}
		while(ch);
		{
			
		}

	}

}
