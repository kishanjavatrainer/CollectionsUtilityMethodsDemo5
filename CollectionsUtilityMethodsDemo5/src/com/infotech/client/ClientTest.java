package com.infotech.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ClientTest {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(400);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(100);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		
		//1.Returns true if the two specified collections have no elements in common.
		boolean disjoint = Collections.disjoint(list1, list2);
		System.out.println(disjoint);
		
		//2.Return the empty (immutable) collection(list,set and map)
		List emptyList = Collections.EMPTY_LIST;
		Set emptySet = Collections.EMPTY_SET;
		Map emptyMap = Collections.EMPTY_MAP;
		
		//3.Returns an enumeration over the specified collection.
		Enumeration<Integer> enumeration = Collections.enumeration(list2);
		while (enumeration.hasMoreElements()) {
			Integer i =  enumeration.nextElement();
			System.out.println(i);
			
		}
		
		System.out.println("-------------------------------------");
		
		//4. Returns an immutable list consisting of n copies of the specified object. 
		List<Integer> list3 = Collections.nCopies(5, 2000);
		list3.forEach(System.out::println);
		
	}

}
