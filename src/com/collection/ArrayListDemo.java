package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List arr =  new ArrayList();
		arr.add("azam");
		arr.add("aarif");
		arr.add("bilal");
		arr.add("umar");
		arr.add(12);
		//git feature-1 branch
		
		Iterator<Object> itr = arr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			for(Object o:arr) {
				System.out.println(o);
			}
		}
			
	}

}
