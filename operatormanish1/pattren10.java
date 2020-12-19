package operatormanish1;

public class pattren10 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int c,n=4;
		for(int i=1;i<=9;i++)
		{
			if(i<=5)
			c=i;
			else
			{
				c=n;
				n--;
		//	System.out.println(c);
			}
			for(int j=1;j<=5;j++)
			{
				if(((i-j)>=1 && i<=5) || ((i+j)<=9 && i>5))
					System.out.print(" ");
				else
				{
					System.out.print(c+" ");
					c++;
				}
			}
			
			System.out.println();
		}

	}

}
