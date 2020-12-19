package operatormanish1;

public class pattren7 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(j>(9/2+1) || (i+j)<=5 || (i-j)>=5)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
