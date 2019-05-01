package com.Class31;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemove {

	public static void main(String[] args) {
		// lets create an arrayList of integers from 1-10.
		//remove all odd numbers using iterator
		
		ArrayList<Integer> alist=new ArrayList<>();
		
		for (int i=1; i<=10; i++ ) {
			alist.add(i);
		}
		System.out.println(alist);
	
		Iterator<Integer> it=alist.iterator();
		while(it.hasNext()) {
			int number=it.next();
			if(number%2!=0) {
				it.remove();
			}
		}
		System.out.println(alist);
	}
}
