package com.java.wildcards;

import java.util.List;

class Sum 
{
	public static void calculateSum(List<? extends Number> nums)
	{
		double sum = 0;
		for(Number num:nums) 
		{
			sum+=num.doubleValue();
		}
		System.out.println("SUm is : " + sum);
	}
}
public class UpperBound {

	public static void main(String[] args) {
		List<Integer> numList = List.of(10,20,30);
		List<Double>  doblist = List.of(10.22,33.4,45.5);
		List<String> names = List.of("Ram","Rahul");
		
		Sum.calculateSum(numList);
		Sum.calculateSum(doblist);
	//	Sum.calculateSum(names);  //Error bcz Sting not extends Number
		
	}

}
