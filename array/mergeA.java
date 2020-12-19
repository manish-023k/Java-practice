package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mergeA {
	public static void merge(int []a,int n1,int ind1,int []b,int n2,int ind2,int []c,int index)
	{
		while(n1>0&&n2>0) //no of elements in array a and b
		{
			if(a[ind1]<=b[ind2]) //index element of array a compare with index element of array b
			{
				c[index]=a[ind1];
				index++;
				ind1++;
				n1--;
			}
			else
			{
				c[index]=b[ind2];
				index++;
				ind2++;
				n2--;
			}
			
		}
		while(n1>0)
		{
			c[index]=a[ind1];
			index++;
			ind1++;
			n1--;
		}
		while(n2>0)
		{
			c[index]=b[ind2];
			index++;
			ind2++;
			n2--;
		}
		
	}
	public static void mergestep(int []a,int n,int c,int []b)
	{
		int sr=n/(2*c); // tells the no of sub arrays
		int e=2*(sr*c); //tells total number of elements in all pairs of arrays
		int r=n-e; // rest elements of array
		for(int i=0;i<sr;i++)
		{
			int sp=(2*i)*c; //starting point of array
			merge(a,c,sp,a,c,sp+c,b,sp);
		}
		if(r<=c)
		{
			for(int i=0;i<r;i++)
				b[e+i]=a[e+i]; // copy last elements of array a to array b
		}
		else //if the last pairs of arrays are unequal size
			merge(a,c,e,a,r-c,e+c,b,e);
	}
	public static void mergesort(int []a,int n)
	{
		int c=1; // tell the number of elements in each sub array
		int []b=new int[n];
		while(c<n)
		{
			mergestep(a,n,c,b);
		   mergestep(b,n,2*c,a);
		   c=4*c;
		}
	}
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the size of array :");
		int n=Integer.parseInt(br.readLine());
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	    mergesort(arr,n);
	    System.out.println("elements of array after sorting :");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
