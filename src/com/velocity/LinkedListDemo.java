package com.velocity;

import java.util.ArrayList;
import java.util.Iterator;


public class LinkedListDemo {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Ankit");
		list.add("Raj");
		list.add("Aditya");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
	}
	}

}
