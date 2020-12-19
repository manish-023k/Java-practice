package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array2dsum {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in) ) ;
		System.out.println("enter the size of array :");
		int n=Integer.parseInt(br.readLine());
		int [][] arr=new int[n][n];
		int [][] brr=new int[n][n];
		int [][]crr = new int[n][n] ;
		System.out.println("enter the elements of first array :");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=Integer.parseInt(br.readLine());
			}
		}
        System.out.println("ente the elements of second array :");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				brr[i][j]=Integer.parseInt(br.readLine());
			}
		}
		System.out.println("sum of two array : ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				crr[i][j]=arr[i][j]+brr[i][j];
				System.out.print(crr[i][j]+" ");
			}
			System.out.println();
		}

		

	}

}
