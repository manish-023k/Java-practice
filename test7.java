import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		String b=Integer.toBinaryString(num);
		System.out.println(b);
		int bnum=Integer.parseInt(b);
		int bn=bnum;
		int res=0;
		while(bnum!=0)
		{
			res=res*10+bnum%10;
			bnum=bnum/10;
		}
		if(res==bn)
			System.out.println("palindrome ");
		else
			System.out.println("not palindrome ");
		

	}

}
