package com.dataStructure;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Enumeration days;
		Vector dayNames = new Vector();
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		
		days = dayNames.elements();
		//while hasMoreElement is true, days.nextElement will print the elements in dayNames vector in successive order
		while (days.hasMoreElements())
		{
			System.out.println(days.nextElement());
		}
		

	}

}
