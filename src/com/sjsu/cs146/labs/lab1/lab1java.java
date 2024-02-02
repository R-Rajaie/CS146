package com.sjsu.cs146.labs.lab1;

import java.util.HashMap;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
 */

public class lab1java {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target;

        //testing out 0 through 10
        for(int i = 0; i <= 10; i++){
            target = i;
            System.out.println(target + ": " + twoSum(nums, target));
        }
        //System.out.println(twoSum(nums, target));
    }
    public static String twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        /*
        our approach is basically putting the items of the array as values of a map, then putting their analogue (target - i)
        as the value. we search to see if that
         */
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
            if(map.containsKey(target - nums[i]) && (target - nums[i]) != nums[i]){
                return "indexes " + map.get(nums[i]) + " and "  + map.get(target - nums[i]);
            }
        }

        return "no pair found";
    }
}
