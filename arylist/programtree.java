package arylist;

import java.util.Comparator;
import java.util.TreeSet;

public class programtree implements Comparator{
	public int compare(Object obj1,Object obj2)
	{
		String str1=obj1.toString();
		String str2=obj2.toString();
		int l1=str1.length();
		int l2=str2.length();
		if(l1==l2)
		return (str1.compareTo(str2));
		else if(l1<l2)
			return(-1);
		else
			return(+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts= new TreeSet(new programtree());
		ts.add("manish");
		ts.add("pammi");
		ts.add("jagdish");
		ts.add("manisha");
		System.out.println(ts);

	}

}
