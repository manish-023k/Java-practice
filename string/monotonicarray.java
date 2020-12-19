package string;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class monotonicarray {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int []arr=new int[n];
		int temp;
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j+1]<arr[j])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					flag=1;
					break;
				}
				
			}
		}
		if(flag==0)
			System.out.println("array is monotonic ");
		else
			System.out.println("array is not monotonic");
		
		

	}

}
