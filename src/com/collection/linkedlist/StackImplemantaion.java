package com.collection.linkedlist;

import java.util.LinkedList;

public class StackImplemantaion {

	public static void main(String[] args) {
		
		LinkedList myStack = new LinkedList();
		myStack.push("Ramling");
		myStack.push(10);
		myStack.push(false);
		myStack.push(55.4);
		System.out.println(myStack.peek());
		System.out.println(myStack.peek());
		System.out.println(myStack.peek());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		//System.out.println(myStack.poll());
	}

}
