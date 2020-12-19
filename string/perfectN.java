package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class perfectN {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int []arr=new int[n];
		int h=0;
	    for(int i=1;i<n;i++)
	    {
	    	if(n%i==0)
	    	{
	    		arr[h]=i;
	    		h++;
	    	}
	    		
	    }
	    int sum=0;
	    for(int i=0;i<h;i++)
	    {
	    	sum=sum+arr[i];
	    }
	    if(sum==n)
	    	System.out.println("nuber is parfect :");
	    else
	    	System.out.println("number is not perfect :");
	    
		
		

	}

}
