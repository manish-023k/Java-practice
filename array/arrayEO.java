package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arrayEO {
	public static void display(int []a,int len)
	{
		for(int i=0;i<len;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		// TODO Auto-generated method stub
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("enter the size of array :");
	    int n=Integer.parseInt(br.readLine());
	    int []arr=new int[n];
	    System.out.println("enter the elements of array :");
	    for(int i=0;i<arr.length;i++)
	    {
	    	arr[i]=Integer.parseInt(br.readLine());
	    }
         display(arr,arr.length);
         int []b= new int[n];
         int []c= new int[n];
         int g=0,p=0;
         for(int i=0;i<arr.length;i++)
         {
        	 if(!(arr[i]%2==0))
        	 {
        		 b[g]=arr[i];
        		 g++;
        	 }
        	 else
        	 {
        		 c[p]=arr[i];
        		 p++;
        	 }
         }
         System.out.print("\n  array of even elements :");
         display(c,p);
         System.out.print("\n array of odd elements :");
         display(b,g);
	}

}
