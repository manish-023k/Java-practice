package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arrayexample {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
//		int []arr= {5,1,15,20,21};
//		int i=++arr[1];
//		int j=arr[1]++;
//		int m=arr[i++];
//		
//		System.out.println(i+" "+j+" "+m+"");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a[]=new int[5];
		int temp;
		for(int i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
			for(int j=0;j<=i;j++)
			{
				if(a[j]>a[i])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
					System.out.print(a[j]+" ");
			}
			
		}

	}

}
