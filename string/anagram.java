package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class anagram {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String str2=br.readLine();
		int l1=str.length();
		int l2=str2.length();
		int count=0;
		int count1;
	    if(l1==l2)
		//if(str.length()==str2.length())
		{
			for(int i=0;i<l1;i++)
			{
				count1=0;
				for(int j=0;j<l1;j++)
				{
				if(str.charAt(i)==str2.charAt(j))
				{
					count1++;
			     	//break;
				}
				}
				if(count1==1)
				{
					count++;
				}
			}
		}
		else
		{
			System.out.println("length of strings are not same :");
		}
		if( count==l1)
		{
			System.out.println("srings are anagram");
		}
		else
			System.out.println("strings are not anagram ");
	

	}

}
