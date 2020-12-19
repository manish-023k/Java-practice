import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test11 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String []srr=str.split(" ");
		for(int i=srr.length-1;i>=0;i--)
		{
			System.out.print(srr[i]+" ");
		}
	}

}
