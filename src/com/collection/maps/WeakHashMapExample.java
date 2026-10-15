package com.collection.maps;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExample {

	public static void main(String[] args) {
		Map<Object,String> rCache = new WeakHashMap<>();
		Object key1 = new Object();
		rCache.put(key1, "The Spicy Grill - Trending Today");
		System.out.println("Before GC : "+rCache);
		key1 = null;
		System.gc();
		
		
		try 
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("After GC : "+rCache);
	}

}
