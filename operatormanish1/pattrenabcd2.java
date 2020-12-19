package operatormanish1;

public class pattrenabcd2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if((i+j)==4 ||(i+j)==8 || (i-j)==2 ||(j-i)==2)
				{
					System.out.print("a");
				}
				
			else if((i*j)==6 || (i*j)==12)
			{
				System.out.print("b");
			}
			else if(i==3 && j==3)
			{
				System.out.print("c");
			}
			else
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
