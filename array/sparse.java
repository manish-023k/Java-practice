package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sparse {

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
		int zcount=0,count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
			     System.out.print(arr[i][j]+" ");
			     if(arr[i][j]==0)
			    	 zcount+=1;
			     else
			    	 count+=1;
			}
			System.out.println();
		}
		if(zcount>count)
			System.out.println("matrix is sparse :");
		else
			System.out.println("matrix is not sparse :");
		
		

	}

}
