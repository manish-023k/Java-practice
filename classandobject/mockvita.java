package classandobject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class mockvita {
	public static boolean isprime(int num)
	{
		if(num==1 || num==2)
			return(true);
		else
		{
			int flag=0;
			for(int p=2;p<=num/2;p++)
			{
				if(num%p==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
				return(true);
			else
				return(false);
		}
		
	}
	public static int largest(ArrayList<Integer> arr)
	{
		int large=arr.get(0) ;
		for(int i=0;i<arr.size();i++)
		{
			if(large<=arr.get(i))
				large=arr.get(i);
		}
		return(large);
	}
	public static int smallest(ArrayList<Integer> arr)
	{
		int small=arr.get(0) ;
		for(int i=0;i<arr.size();i++)
		{
			if(small>=arr.get(i))
				small=arr.get(i);
		}
		return(small);
	}
	public static void fibnocci(int a,int b,int count)
	{
		long fog=0;
		long first=a;
		long second=b;
		for(int i=0;i<count-2;i++)
		{
			fog=first+second;
			first=second;
			second=fog;
			
		}
		System.out.println(fog);
		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		ArrayList<Integer> alist=new ArrayList();
		ArrayList<Integer> alist1=new ArrayList();
		
		for(int i=n1;i<=n2;i++)
		{
			if(isprime(i)==true) // checking the numbers between n1 and n2 are prime or not
				alist.add(i);
			else
				continue;
		}
		Iterator itr=alist.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		for(int m=0;m<alist.size();m++)
		{
			int f=alist.get(m);
			for(int n=0;n<alist.size();n++)
			{
				int l=alist.get(n);
				if(l>=0 && l<=9)
				{
					int res=f*10+l;
					if(isprime(res)==true)
						alist1.add(res);
				}
				if(l>=10 && l<=99)
				{
					int res=f*100+l;
					if(isprime(res)==true)
						alist1.add(res);
				}
				if(l>=100 && l<=999)
				{
					int res=f*1000+l;
					if(isprime(res)==true)
						alist1.add(res);
				}
				if(l>=1000 && l<=9999)
				{
					int res=f*10000+l;
					if(isprime(res)==true)
						alist1.add(res);
				}
			}
		}
		System.out.println("********************");
		Iterator itr1=alist1.iterator();
		while(itr1.hasNext())
			System.out.print(itr1.next()+" ");
		System.out.println("***************************");
		int lar=largest(alist1);
		System.out.println(lar);
		System.out.println("***************************");
		int sma=smallest(alist1);
		System.out.println(sma);
		int siz=alist1.size();
		fibnocci(sma,lar,siz);


	}

}
