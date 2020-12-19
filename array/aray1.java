package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 //import java.util.Scanner;

public class aray1 {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		// TODO Auto-generated method stub
		// taking elements of array from user and print it
		//Scanner in=new Scanner(System.in);
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the size of array :");
		//int n=in.nextInt();
		int n=Integer.parseInt(in.readLine());
		System.out.println("enter the elements of array");
		int [] arr=new int [n]; 
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(in.readLine());
		}
		System.out.println("ellemts of array are :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
        System.out.println("enter the sreaching number :"); 
        int x=Integer.parseInt(in.readLine());
        int flag=0;
        for(int i=0;i<arr.length;i++)
        {
        	if(x==arr[i])
        	{
        		System.out.println("positon of number in array :"+i);
        		flag=1;
        		break;
        	}
        }
        if(flag==0)
        System.out.println("element is not in array");
        
	}

}
