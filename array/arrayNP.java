package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arrayNP {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the size of array :");
		int n=Integer.parseInt(br.readLine());
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		for(int i=0;i<arr.length;i++)
		{
		    int flag=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					flag=flag+1;
				}
			}
			if(flag==1)
				System.out.print(arr[i]+" ");
				
		}

	}

}
