package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arrayOCCNUM {

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
		}
		int count ;
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					count+=1;
			}
			System.out.println(arr[i]+"occurance of number :"+count);
		}
	}

}
