package arylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
			al.add("man");
			al.add("nis");
			al.add("ish");
		//	System.out.println(al);
			al.add(2,"manish");
			ArrayList<String> al1=new ArrayList<>();
			al1.addAll(al);
		//	System.out.println(al1);
			al.remove("manish");
			//System.out.println(al);
		//	System.out.println(al1);
			
		
			Collections.sort(al1);
			Iterator itr=al1.iterator();
			while(itr.hasNext())
				System.out.println(itr.next());
			System.out.println("*******************************");
			ListIterator<String> lsitr=al1.listIterator(al1.size());
			while(lsitr.hasPrevious())
				System.out.println(lsitr.previous());
			
		

	}

}
