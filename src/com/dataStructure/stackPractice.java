package com.dataStructure;

import java.util.Stack;

public class stackPractice {

	static void pushElement(Stack<Integer> st , int a)
	{
		st.push(new Integer(a));
		System.out.println("push(" + a + ")");
	      System.out.println("stack: " + st);
		
	}
	
	static void popElement(Stack<Integer> st)
	{
		System.out.print("pop -> ");
	      Integer a = (Integer) st.pop();
	      System.out.println(a);
	      System.out.println("stack: " + st);
	}
	
	public static void main (String arg[])
	{
		Stack st = new Stack();
		System.out.println("Stack" + st);
		//add the element to last
		pushElement(st, 45);
		pushElement(st, 34);
		pushElement(st, 12);
		pushElement(st, 01);
		//will retrieve the last element and remove it LIFO (last in first out)
		popElement(st);
		popElement(st);
		
	}

}
