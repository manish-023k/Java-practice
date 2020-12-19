import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean flag=false;
		String str=br.readLine();
		String str2=br.readLine();
	
		String []sr2=str2.split(" ");
		
		String st="";
		String rs="";int k=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ' || i==str.length()-1)
			{
				rs="";
				if(i==str.length()-1)
					rs=str.substring(k,i+1);
				else
				rs=str.substring(k,i);
				
			
			for(int j=0;j<sr2.length;j++)
			{
				if(str2.contains(rs))
				{
					
					System.out.print(rs+" ");
					break;
					
					//break;
				}
				else
				{
					if(flag==false) {
					st=rs.substring(0,1).toUpperCase();
				    rs=st+rs.substring(1);
				    System.out.print(rs+" ");
				    flag=true;
					} 
				}
			}
			
			k=i+1;		
			flag=false;
		}
		//System.out.println(rs);

	}
	}
}
