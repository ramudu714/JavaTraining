package com.monocept.test;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> names = new HashSet<String>();
		
		names.add("ravi");
		names.add("ravi");
		names.add("subbu");
		names.add("bharat");
				
				
		System.out.println(names);
		
		Iterator<String> itr = names.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		names.removeIf(str->str.contains("subbu"));
		System.out.println("after removing ");
		itr = names.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}
