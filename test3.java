import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		if(str.isEmpty() || str==null)
		{
			System.out.println("enter the string again ");
			str=br.readLine();
		}
		else
		{
		if(str.contains("1") && str.contains("A"))
			System.out.println("invalid String ");
		else if(str.contains("1"))
		{
			char a='A';
			for(int i=0;i<str.length();i++)
			{
				System.out.print(a);
				a++;
			}
		}
		else
		{
			for(int i=1;i<=str.length();i++)
			{
				System.out.print(i);
			}
		}
		}

	}

}
