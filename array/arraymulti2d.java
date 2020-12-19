package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arraymulti2d {

	public static void main(String[] args) throws NumberFormatException, IOException ,NullPointerException
	{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in) ) ;
		System.out.println("enter the size of array :");
		int n1=Integer.parseInt(br.readLine());
		int m1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int m2=Integer.parseInt(br.readLine());
		int [][] arr=new int[n1][m1]; //n1 is row and m1 is column of first array 
		int [][] brr=new int[n2][m2]; //n2 is rows and m2 is column of second array
		int [][]crr = new int[n1][m2] ;
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
      
		System.out.println("multiplication  of two array : ");
		if(m1==n2)
		{
			
		for(int i=0;i<crr.length;i++)
		{
			for(int j=0;j<crr[i].length;j++)
			{
				int res=0;
				for(int k=0;k<m1;k++)
				{
					res=res+(arr[i][k]*brr[k][j]); // in arr array k defines the change in columns 
			                                       // in brr array k defines the change in rowss	
				}
				crr[i][j]=res;
				System.out.print(crr[i][j]+" ");
			}
			System.out.println();
		}
		}

	}

}
