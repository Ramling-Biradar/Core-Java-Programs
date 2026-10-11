package com.collection.tree;

import java.util.Scanner;
import java.util.TreeSet;

public class KthSmallest {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size");
		int n = sc.nextInt();
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int i=0;i<n;i++) {
			ts.add(sc.nextInt());
		}
		
		System.out.println("Enter K");
		
		int k = sc.nextInt();
		
		if(k>0 && k<=ts.size()) 
		{
			int count = 0;
			
			for(int num:ts) 
			{
				count++;
				if(count==k) 
				{
					System.out.println(num);
					break;
				}
				
			}
		}
		else
		{
			System.out.println("Invalid K Value");
		}
	}

}
