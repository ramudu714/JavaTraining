package com.monocept.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("sushant");
		names.add(1,"prabhu");
		names.add(2,"prashant");
		names.add(3,"gopi");
		
		for(String s: names)
			System.out.println(s);
		
		System.out.println("length of list is: "+names.size());
		
		System.out.println("element at 2nd place is: "+names.get(2));
		
		names.remove(3);
		System.out.println("now length of list is: "+names.size());
		
		Collections.sort(names);
		
		for(String s: names)
			System.out.println(s);
		
		Iterator<String> itr = names.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}
