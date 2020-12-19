package arylist;

import java.util.Iterator;
import java.util.LinkedList;

public class linkprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Object> lp=new LinkedList();
		lp.add("manish");
		lp.add(12);
		lp.add("jagdish");
		lp.add(7.48f);
		Iterator itr=lp.iterator();	
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
