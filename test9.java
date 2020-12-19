import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test9 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		int count;
		int mid=arr.length/2;
		int flag=0;
		int pos=0;
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					count++;
			}
			if(count > flag)
			{
				flag=count;
				pos=i;
			}
		}
		if(flag>mid)
		{
				System.out.println("majority element is " +arr[pos]);
				
		}
		else
			System.out.println(" there is no majority element ");

	}

}
