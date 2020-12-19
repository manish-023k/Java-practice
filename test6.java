import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int r,c;
		r=Integer.parseInt(br.readLine());
		c=Integer.parseInt(br.readLine());
		int [][]arr=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=Integer.parseInt(br.readLine());
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
        System.out.println("after transpose ");
    	for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}

}
