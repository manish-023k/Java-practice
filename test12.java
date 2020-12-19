import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class test12 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String arr[]=str.split(" ");
		HashMap<String,Integer> mp=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(mp.containsKey(arr[i]))
			{
				mp.put(arr[i], mp.get(arr[i])+1);
				
			}
			else
			{
				mp.put(arr[i], 1);
			}
		}
		for(Map.Entry em:mp.entrySet())
		{
			System.out.println(em.getKey()+" "+em.getValue());
		}
		

	}

}
