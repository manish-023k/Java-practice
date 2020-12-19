package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class revinpal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		if(str==null || str.isEmpty())
			System.out.println("enter the string ");
		char arr[]=str.toCharArray();
		int i=0;
		char temp;
		int j=arr.length-1;
		while(i!=j)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		for(int i1=0;i1<arr.length;i1++)
		{
			System.out.print(arr[i1]+" ");
		}
		

	}

}
