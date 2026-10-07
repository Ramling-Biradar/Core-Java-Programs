package com.collection.linkedlist;

public class GenericMethodExample {
	
	public static<T> void displayData(T item) 
	{
		System.out.println("Item : " + item);
	}

	public static void main(String[] args) {
		displayData("Ramling");
		displayData(true);
		displayData(19);
		displayData(22.22);
		displayData('M');

	}

}
