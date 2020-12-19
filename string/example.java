 package string;
 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the rows and column ");
		int r=Integer.parseInt(br.readLine());
		int n=Integer.parseInt(br.readLine());
        int c=0;	  
	    String[][]sr1=new String[r][n];
	    for(int i=0;i<sr1.length;i++)
	    {
	    	  String str=br.readLine();
	    	sr1[i]=str.split(" ");
	    }
	    System.out.println(" ************************");
	    for(int i=0;i<sr1.length;i++)
	    {
	    	for(int j=0;j<sr1[i].length;j++)
	    	{
	    		if(sr1[i][j].charAt(0)=='a')
	    		c=5-sr1[i][j].length();
	    		
	    		else if(sr1[i][j].charAt(0)=='b')
	    			c=3-sr1[i][j].length();
	    		else if(sr1[i][j].charAt(0)=='c')
	    			c=6-sr1[i][j].length();
	    		System.out.print(" * "+sr1[i][j]);
	    		for(int k=0;k<c;k++)
	    			System.out.print(" ");
	    	}
	    	System.out.print(" *");
	    	System.out.println();
	    }
	    System.out.println(" ************************");
	   
	    

	}

}
