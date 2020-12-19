package array;

import java.io.*;

public class binaryS {
	public static int binarysearch(int []arr,int a,int b,int item)
	{
		
		if(a<=b) 
		{
			int mid=(a+b)/2;
			if(arr[mid]==item)
				return(mid);
			if(arr[mid]<item)
		     	return binarysearch(arr,mid+1,b,item);
		   return binarysearch(arr,a,mid-1,item);
	
		}
		return -1;
	
	}
	public static void selectsort(int []a)
	{
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	public static void insertsort(int []a) throws IOException
	{
		int temp;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j>0;j--)
			{
				if(a[j]<a[j-1])
				{
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
	}
	
	
    public static void bubblesort(int []a) throws IOException
    {
    	int flag=1,temp;
    	for(int i=0;i<a.length;i++)
    	{
    		for(int j=0;j<a.length-i-1;j++)
    		{
    			if(a[j]>a[j+1])
    			{
    				temp=a[j];
    				a[j]=a[j+1];
    				a[j+1]=temp;
    			}
    		}
    	}
    }
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("enter the size of array :");
		int n=Integer.parseInt(br.readLine());
		int [] arr=new int[n];
		System.out.println("enter the elemets in array  :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
			
		}
		//bubblesort(arr);
		//insertsort(arr);
		selectsort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		System.out.println("enter the element sreach :");
		int item=Integer.parseInt(br.readLine());
		int res=binarysearch(arr,0,arr.length-1,item);
		if(res==-1)
			System.out.println("element is not found ");
		else
			System.out.println("element found "+res);
		
		
		
		

	}

}
