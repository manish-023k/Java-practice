package operatormanish1;

public class pattren5 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	/*	for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
				
			   System.out.print(" ");
			
			for(int k=1;k<=(2*i)-1;k++)
				
				System.out.print("*");
			
			System.out.println();
		}
		int in=9;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
				
			   System.out.print(" ");
			in=in-2;
			
			for(int k=1;k<=in;k++)
				
				System.out.print("*");
			
			System.out.println();
		}*/
		int i,j;
		for( i=1;i<=9;i++)
		{
			for( j=1;j<=9;j++)
			{
				if((i+j)<=5 ||(i+j)>=15 ||(i-j)>=5 || (j-i)>=5 )
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
