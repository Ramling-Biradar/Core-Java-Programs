package com.collection.queue;
import java.util.*; 
public class ServerRequestQueue {

	public static void main(String[] args) {
		
		Queue<String>  requestQueue = new LinkedList<String>();
		requestQueue.add("Request 1");
		requestQueue.add("Request 2");
		requestQueue.add("Request 3");
		
		System.out.println("Request Queue :" + requestQueue);
		System.out.println(requestQueue.poll()); //FIFO
		System.out.println("Request Queue :" + requestQueue);
		System.out.println(requestQueue.poll()); //FIFO
		System.out.println(requestQueue.peek());
		System.out.println(requestQueue.isEmpty());
		System.out.println(requestQueue.remove());
		System.out.println(requestQueue.poll()); //FIFO
		System.out.println(requestQueue.poll()); //FIFO
	//	System.out.println(requestQueue.remove());
		System.out.println(requestQueue.isEmpty());
	}

}
