package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class largestdiff {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the size of array :");
		int n=Integer.parseInt(br.readLine());
		int [] arr=new int[n];
		int large=0,small=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
			large=arr[0];
			small=arr[0];
			if(arr[i]>large)
			large=arr[i];
			else if(arr[i]<small)
				small=arr[i];
		}
		System.out.print(large +" "+small);

	}

}
