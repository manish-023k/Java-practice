package operatormanish1;

public class pattren9 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int in,c=1;
		for(int i=1;i<=7;i++)
		{
			if(i<=4)
			in=i+1;
			else
			{
				in=(i+1)-(2*c);
				c++;
			}
			for(int j=1;j<=7;j++)
			{
				if((i+j)<=4 || (i+j)>=12 || (j-i)>=4 ||(i-j)>=4)
				{
					System.out.print(" ");
				}
				else
				{
					if(j>4 && (j-i)<=4)
					{
						in++;
					  System.out.print(in);
					}
					else
					{
						in--;
						System.out.print(in);
						
					}
				}
			}

			System.out.println();
		}

	}

}
