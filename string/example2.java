package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// TODO Auto-generated method stub\
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int r=Integer.parseInt(br.readLine());
		int c=Integer.parseInt(br.readLine());
		int [][] arr=new int[r][c];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=Integer.parseInt(br.readLine());
			}
		}
		int s=0;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if((i+j)==s)
					System.out.print(arr[i][j]);
				
			}
			s++;
		}

	}

}
