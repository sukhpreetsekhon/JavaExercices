package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
		
		List<Integer> linkedListNumber = new LinkedList<Integer>();
		
		linkedListNumber.add(12);
		linkedListNumber.add(3);
		linkedListNumber.add(23);
		linkedListNumber.add(65);
		linkedListNumber.add(8);
		
		System.out.print("LinkedList is:");	
		System.out.println(linkedListNumber);	
		

	}

}