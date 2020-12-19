package string;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class shortpalin {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String str=br.readLine();
       String []sr=str.split(" ");
       String []sa1=new String[sr.length];
       int  g=0;
       for(int i=0;i<sr.length;i++)
       {
    	  // System.out.println(sr[i]);
    	 StringBuffer bs=new StringBuffer(sr[i]);
   		bs.reverse();
   		String str2=String.valueOf(bs);
   	/*	String str2="";
   		for(int i=str.length()-1;i>=0;i++)
   			str2=str2+str.charAt(i);*/
   		if(str2.equals(sr[i]))
   		{
   			sa1[g]=str2;
   			g++;
   		}
   			
       }
       String temp=sa1[0];
       for(int i=1;i<g;i++)
       {
    	   if(temp.length()>sa1[i].length())
    	   temp=sa1[i];
       }
       for(int i=0;i<g;i++)
       {
    	   if(temp.length()==sa1[i].length())
    	   System.out.print(temp+" ");
       }
       

}
}
