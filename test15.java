import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test15 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String  str1=br.readLine();
		String sr[]=str.split(""); 
		int count=0;
		int mid=str.length()/2;
		for(int i=0;i<sr.length;i++)
		{
			if(str1.contains(sr[i]))
			{
				count++;
			}
		}
		if(count>=mid)
			System.out.println("strings are equal ");
		else
			System.out.println("Strings are not equal ");

	}

}
