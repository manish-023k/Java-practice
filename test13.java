import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class test13 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		char [ ]crr=str.toCharArray();
		HashMap<Character,Integer> mp=new HashMap<>();
		for(int i=0;i<crr.length;i++)
		{
			if(crr[i]==' ')
				continue;
			else if(mp.containsKey(crr[i]))
			{
				mp.put(crr[i],mp.get(crr[i])+1);
				
			}
			else
			{
				mp.put(crr[i], 1);
			}
		}
		System.out.println(mp);

	}

	
}
