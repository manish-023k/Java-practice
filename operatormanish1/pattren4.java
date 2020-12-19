package operatormanish1;

public class pattren4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int count;
		for(int i=1;i<=5;i++)
		{
			count=1;
			for(int j=5;j<=i;j++)
			{
				System.out.println(" ");
			}
			for(int k=1;k<=(2*i)-1;k++)
			{
				if(count<=i)
				{
					System.out.println(count);
					count++;
				}
				else
				{
					count--;
					System.out.println(count);
				}
			}
		}

	}

}
