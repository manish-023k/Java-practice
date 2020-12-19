
public class test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5,6,7,8,9};
		int []brr= {1,2,3,5,6,7,8,9};
		int flag=0;
		int i=0;
		for( i=0;i<brr.length;i++)
		{
			if(brr[i]==arr[i])
				continue;
			else
			{
				System.out.println(arr[i]);
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(arr[i]);
		}

	}

}
