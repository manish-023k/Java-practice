package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mobile {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//Double mn=Double.parseDouble(br.readLine());
		String str=br.readLine();
		int len=str.length();
		int count;
		int count1;
		for(int i=0;i<len;i++)
		{
			count=0;
			count1=0;
			for(int j=0;j<len;j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
				}
			}
			for(int j=i;j<len;j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count1++;
				}
			}
			if(count==count1)
			System.out.println(str.charAt(i)+"have frequency :"+count);
		}
	}

}
