package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arrayrotate {
	public static void rotate(int a[])
	{
		int temp=a[0];
		for(int i=1;i<a.length;i++)
			a[i-1]=a[i];
		a[a.length-1]=temp;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the size of array :");
		int n=Integer.parseInt(br.readLine());
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		rotate(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		
	}
	

}
