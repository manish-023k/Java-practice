import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class testanshul {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int [][]arr=new int[n][n];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				int el=Integer.parseInt(br.readLine());
				if(el>=11 && el<=55)
				{
					arr[i][j]=el;
				}
				else
				{
					System.out.println("enter the element again...");
					arr[i][j]=Integer.parseInt(br.readLine());
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int a=1,b=1;
		int sum=0;
		int flag=0;
		System.out.print(11+"->");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				sum=a*10+b;
				if(arr[a-1][b-1]==sum)
				{
					System.out.print("treasure found ");
					flag=1;
					break;
					
				}
				else
				{
					int x=arr[a-1][b-1];
					System.out.print(x+"->");
					b=x%10;
					x=x/10;
					a=x%10;
				}
			}
			if(flag==1)
				break;
		}

	}

}
