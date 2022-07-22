package com.monocept.test;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>(); 
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		
		System.out.println(list);
		
		for(int node : list)
			System.out.print(node);
		
		System.out.println("\n");
		
		list.add(2,25);
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		
		System.out.println("\n");
		int first=list.getFirst();
		System.out.println("first element is: "+first);
		
		int last=list.getLast();
		System.out.println("last element is: "+last);
		
		int index=list.indexOf(30);
		System.out.println("index of 30 is "+index);
		
		list.addLast(60);
		list.remove(2);
		
		System.out.println(" after removals ");
		itr = list.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");

		itr = list.descendingIterator();
		System.out.println("\n printing in reverse order");
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		
		list.clear();
		itr = list.iterator();
		System.out.println("\n after clearing list");
		while(itr.hasNext())
			System.out.print(+itr.next()+" ");
		
	}

}
