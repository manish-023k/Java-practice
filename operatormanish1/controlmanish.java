package operatormanish1;
import java.util.Scanner;

public class controlmanish 
{
	public static void mul(int n)
	{
		if(n%3==0 && n%5==0) //number multiple of 3 and 5 
			System.out.println("fizz buzz");
		else if(n%5==0) //number multiple of 5
			System.out.println("buzz");
		else if(n%3==0) // number multiple of 3
			System.out.println("fizz");
		else
			System.out.println("invalid number");
	}
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("enter the value :");
		int num=in.nextInt();
		mul(num);
	}

}
