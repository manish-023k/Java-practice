package arylist;

import java.util.Vector;

public class vectorprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vr=new Vector(10,2);
		System.out.println(vr.capacity());
		for(int i=1;i<=10;i++)
			vr.add(i);
		System.out.println(vr.capacity());
		vr.addElement(11);
		System.out.println(vr.capacity());

	}

}
