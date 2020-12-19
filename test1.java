
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p,t;
		for(int i=1;i<=5;i++)
		{
			p=i;
			t=1;
			for(int j=1;j<=5;j++)
			{
			    if(i==5)
			    {
			    	System.out.print(5+" "+1+" "+2+" "+3+" "+4);
			    	break;
			    }
				else if(j<i)
				{
					System.out.print(p+" ");
					p--;
				}
				else
				{
					System.out.print(t+" ");
					t++;
				}
			}
			System.out.println();
		}

	}

}
