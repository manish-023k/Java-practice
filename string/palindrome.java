package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class palindrome {

	public static void main(String[] args) throws IOException,NullPointerException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int len=str.length();
		//StringBuffer bs=new StringBuffer(str);
		//bs.reverse();
		//String str2=String.valueOf(bs);
		
    	String str2 ="";
//	//	String []str1=new String[len];
//		int g=0;
		for(int i=len-1;i>=0;i--)
			str2=str2+str.charAt(i);
	    if(str.equalsIgnoreCase(str2))
	         System.out.println("palindrome");
	    else
			System.out.println("not palindrome ");
	}

}
