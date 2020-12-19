package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arrayLandS {
	public static void smallestfs(int []a)
	{
		int s1,s2,temp;
		s1=a[0];
		s2=a[1];
		if(s2<s1)
		{
			temp=s2;
			s2=s1;
			s1=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<s1)
			{
				s2=s1;
				s1=a[i];
			}
			else if(a[i]<s2 && a[i]>s1)
			{
				s2=a[i];
			}
		}
		System.out.println("first largest number :"+s1);
		System.out.println("second largest number :"+s2);
	
		
	}
	public static void largestfs(int []a)
	{
		int l1,l2,temp;
		l1=a[0];
		l2=a[1];
		if(l2>l1)
		{
			temp=l1;
			l1=l2;
			l2=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>l1)
			{
				l2=l1;
				l1=a[i];
			}
			else if(a[i]>l2 && a[i]<l1)
			{
				l2=a[i];
			}
		}
		System.out.println("first largest number :"+l1);
		System.out.println("second largest number :"+l2);
		
	}

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the the size of array :");
		int n=Integer.parseInt(br.readLine());
		int[] arr=new int[n];
		System.out.println("enter the elements in array ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(br.readLine()); 
		}
		//largestfs(arr);
		smallestfs(arr);
		

	}

}
