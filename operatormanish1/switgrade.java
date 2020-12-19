package operatormanish1;

import java.util.Scanner;

public class switgrade {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int num=(in.nextInt())/10; // use to decrease the casees and make program efficient
		switch(num)
		{
		case 10:
		case 9:
		case 8:
			System.out.println("excellent");
			break;
		case 7:
			System.out.println("very good");
			break;
		case 6:
		case 5:
			System.out.println("good");
			break;
		case 4:
			System.out.println("avrage");
			break;
			default:
				System.out.println("fail");
			break;
		}

	}

}
