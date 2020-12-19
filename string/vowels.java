package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class vowels {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s1=br.readLine();
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='e' || s1.charAt(i)=='a' || s1.charAt(i)=='i'|| s1.charAt(i)=='o'||s1.charAt(i)=='u'
				||	s1.charAt(i)=='A' ||	s1.charAt(i)=='I' ||s1.charAt(i)=='U' ||s1.charAt(i)=='O' ||s1.charAt(i)=='E')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
