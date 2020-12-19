package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reverse {
	public static void frtpalin(String str)
	{
		StringBuffer bs=new StringBuffer(str);
		bs.reverse();
		String str2=String.valueOf(bs);
	/*	String str2="";
		for(int i=str.length()-1;i>=0;i++)
			str2=str2+str.charAt(i);*/
		if(str2.equals(str))
		System.out.println(str+" is palindrome");
		else
			System.out.println(str+"is not palindrome");
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String str=br.readLine();
       String []sr=str.split(" ");
       for(int i=0;i<sr.length;i++)
       {
    	  // System.out.println(sr[i]);
    	   frtpalin(sr[i]);
       }
       
     	}

}
