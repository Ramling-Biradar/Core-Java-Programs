package com.java.wildcards;

import java.util.List;

class Printer 
{
	public void printList(List<?> list) {
		for(Object obj: list) 
		{
			System.out.print(obj+ " ");
		}
		System.out.println();
	}
}
public class Unbounded {

	public static void main(String[] args) {
		Printer p = new Printer();
		p.printList(List.of(10,20,30));
		p.printList(List.of("Ram","Rahul"));
		p.printList(List.of(true,false,true));
	}

}
