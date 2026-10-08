package com.java.wildcards;

import java.util.ArrayList;
import java.util.List;

class LowerSumDemo {

    public static void addNumbers(List<? super Integer> nums) {

        nums.add(10);
        nums.add(20);
        nums.add(30);

        System.out.println(nums);
    }
}

public class LowerBound {

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

        LowerSumDemo.addNumbers(intList);
        LowerSumDemo.addNumbers(numberList);
        LowerSumDemo.addNumbers(objectList);
    }
}