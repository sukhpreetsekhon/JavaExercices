package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arrayListNames = new ArrayList<String>();
		arrayListNames.add("sukh");
		arrayListNames.add("preet");
		arrayListNames.add("");
		arrayListNames.add("jag");
		arrayListNames.add("deep");
		arrayListNames.add("");
		arrayListNames.add("Tej");
		arrayListNames.add("inderveer");
		
		System.out.print("ArrayList is:");	
		System.out.println(arrayListNames);	
		
		 //Traversing list through Iterator  
		 
		ListIterator<String> itr = arrayListNames.listIterator();
		while (itr.hasNext())
		{
			System.out.println("using ListItertor:" + itr.next());
		}
		
		
		List<Integer> linkedListNumber = new LinkedList<Integer>();
		
		//add the elements in the list
		linkedListNumber.add(12);
		linkedListNumber.add(3);
		linkedListNumber.add(23);
		linkedListNumber.add(65);
		linkedListNumber.add(8);
		
		// display list of numbers
		System.out.print("LinkedList is:");	
		System.out.println(linkedListNumber);	
		
		//using iterator 
		Iterator<Integer> listItr = linkedListNumber.iterator();
		
		while(listItr.hasNext())
		{
			System.out.println(listItr.next());
		}
		
		//size of linked list
		System.out.println("size of list: " + linkedListNumber.size());	
		//hashcode 
		System.out.println("hashCode: " + linkedListNumber.hashCode());	
		//displays indexof element 3
		System.out.println("index of 65 is is: " + linkedListNumber.indexOf(65));	
		
		//if element is not in list, it will return -1
				System.out.println("index of 7 is is: " + linkedListNumber.indexOf(7));	
		
		//displays number at index 2
				System.out.println("number at index 2: " + linkedListNumber.get(2));	
		
		//confirm is list is empty
		System.out.println("is the list empty: " + linkedListNumber.isEmpty());	
		//delete all elements of list
		 linkedListNumber.clear();
		 System.out.print("LinkedList is:");
		 System.out.println("is the list empty: " + linkedListNumber.isEmpty());	
			System.out.println(linkedListNumber);

	}

}
