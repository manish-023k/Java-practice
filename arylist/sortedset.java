package arylist;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class sortedset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	  TreeSet ts=new TreeSet();
	  for(int i=1;i<=5;i++)
		  ts.add(i);
	  Iterator itr=ts.iterator();
	  while(itr.hasNext())
		  System.out.println(itr.next());
	  System.out.println("###################################");
	  System.out.println(ts.first());
	  System.out.println(ts.last());
	  System.out.println(ts.headSet(3));
	  System.out.println(ts.tailSet(3));
	  System.out.println(ts.subSet(1, 5));
	}

}
