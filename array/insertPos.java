package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class insertPos {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the size of array :");
		int n=Integer.parseInt(br.readLine());
		int []arr=new int[20];
		int g=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("enter the number and position ");
		int res=Integer.parseInt(br.readLine());
		int pos=Integer.parseInt(br.readLine());
		int temp;
		for(int i=(n-1);i>=(pos-1);i--)
		{
			arr[i+1]=arr[i];
		}
		arr[pos-1]=res;
	//	System.out.println(arr.length);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(arr[n]);

	}

}
