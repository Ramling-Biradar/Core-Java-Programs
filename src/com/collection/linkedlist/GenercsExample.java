package com.collection.linkedlist;

class Box<T>
{
	private T item;
	
	public void setItem(T item) {
		this.item = item;
	}
	
	public T getItem() {
		return item;
	}
}
public class GenercsExample {

	public static void main(String[] args) {
		
		//Creating Box for String Type
		Box<String> box1 = new Box<String>();
		box1.setItem("Book");
		System.out.println("Box1 has : " + box1.getItem());
		
		Box<Integer> box2 = new Box<Integer>();
		box2.setItem(20);
		System.out.println("Box2 has " + box2.getItem());
		
		
	}

}
