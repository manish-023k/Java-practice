//import java.util.Scanner;

public class testing {
	int len;
	int tepary[];
    int array[];
	
    public void sort(int[] arr)
    {
    	len=arr.length;
    	array=arr;
    	tepary=new int[len];
    	divarray(0,len-1);
    }
    public  void divarray(int low ,int high)
    {
    	if(low < high)
    	{
    		int middle=low+(high-low)/2;// to middle the index
    		divarray(low,middle); //sort the left sub list
    		divarray(middle+1,high); //srt the right sub list
    		merge(low,middle,high);
    	}
    }
    public void merge(int low,int middle,int high)
    {
    	for(int i=0;i<len;i++)
    		tepary[i]=array[i];
    	int i=low;
    	int j=middle+1;
    	int k=low;
    	while(i<=middle && j<=high)
    	{
    		if(tepary[i]<=tepary[j])
    		{
    			array[k]=tepary[i];
    			i++;
    		}
    		else
    		{
    			array[k]=tepary[j];
    			j++;
    		}
    		k++;
    	}
    		while(i<=middle)
    		{
    			array[k]=tepary[i];
    			i++;
    			k++;
    		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {12,3,53,-1,-2,10};
		testing obj=new testing();
		obj.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	
	}

}
