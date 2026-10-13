package com.collection.linkedlist;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Practice {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList<>();
		arr.add(null);
		System.out.println(arr);
		LinkedList ll = new LinkedList<>();
		ll.add(null);
		System.out.println(ll);
		ArrayDeque ad = new ArrayDeque<>();
		//ad.add(null);
		//System.out.println(ad);
		PriorityQueue pq = new PriorityQueue<>();
		//pq.add(null);
		System.out.println(pq);
		TreeSet t = new TreeSet<>();
		t.add(null);
		System.out.println(t);

	}

}
