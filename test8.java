import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test8 {
	public static void stojv(String str)
	{
		char [] crr=str.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<crr.length;i++)
		{
			if(crr[i]=='_' || crr[i]==' ')
			{
				sb.append(Character.toUpperCase(crr[i+1]));
				crr[i+1]='0';
			}
			else
			{
				if(crr[i]!='0')
				sb.append(crr[i]);
			}
				
		}
		System.out.println(sb);
	}
	public static void jvtos(String str)
	{
		char crr[]=str.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<crr.length;i++)
		{
			if(Character.isUpperCase(crr[i]))
			{
				sb.append('_');
				sb.append(Character.toLowerCase(crr[i]));
			}
			else
			{
				sb.append(crr[i]);
			}
		}
		System.out.println(sb);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		if(str.isEmpty() ||str==null)
			System.out.println("enter the String again ");
	
		if(str.contains("_"))
		{
			stojv(str);
		}
		else
		{
			jvtos(str);
		}
	}

}
