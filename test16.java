import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test16 {
	public static void display(String st) 
	{
		int len=st.length();
		int mid=len/2;
		String ftr=st.substring(0, mid);
		String ltr=st.substring(mid,len);
		System.out.print(ftr+" ");
		System.out.print(ltr+" ");
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String []srr=str.split(" ");
		for(int i=0;i<srr.length;i++)
		{
			int l=srr[i].length();
			if(l%2==0 && l>2)
				display(srr[i]);
			else
				System.out.print(srr[i]+" ");
		}
		

	}

}
