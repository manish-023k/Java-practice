package arylist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>list=new ArrayList();
		list.add(10);
		list.add(33);
		list.add(57);
		list.add(70);
		list.add(92);
		list.add(25);
		System.out.println(list);
		List<Integer> list2=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(list2);
		List<Integer> list3=list.stream().map(j->j*2).collect(Collectors.toList());
		System.out.println(list3);

	}

}
