package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arrayMissing {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the size of array :");
		int n=Integer.parseInt(br.readLine());
		int [] arr=new int[n];
		int sum=1,sum1=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
			sum+=i;
			sum1+=arr[i];
		}
		sum=sum+(arr.length+1);
		int res=sum1-sum;
		System.out.println(res);
	}

}
