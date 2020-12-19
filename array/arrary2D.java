package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arrary2D {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number of rows:");
		int n=Integer.parseInt(in.readLine());
		int [][] arr=new int [n][];
		for(int i=0;i<arr.length;i++)
		{ System.out.println("enter the number of columns for ith rows :");
		    int s=Integer.parseInt(in.readLine());
		    arr[i]=new int[s];
		}
		System.out.println("enter the elements in array :");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=Integer.parseInt(in.readLine());
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
		

	}

}
