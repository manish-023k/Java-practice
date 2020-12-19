package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class transpose {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the size of array :");
		int n=Integer.parseInt(br.readLine());
		int [][] arr=new int[n][n];
		//int large=0,small=0;
		System.out.println("enter the elements in array :");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
			     arr[i][j]=Integer.parseInt(br.readLine());
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
	//	System.out.println("after transpose :");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(j>=i)
				System.out.print(arr[i][j]+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
