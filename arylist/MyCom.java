package arylist;
import java.util.*;
public class MyCom implements Comparator {
	public int compare(Object obj1,Object obj2)
	{
		String str1=obj1.toString();
		String str2=obj2.toString();
		return (str1.compareTo(str2));
		
		
	}

}
