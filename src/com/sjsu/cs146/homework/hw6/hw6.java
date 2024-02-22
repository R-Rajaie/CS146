package com.sjsu.cs146.homework.hw6;
import java.util.*;

public class hw6 {
    public static void main(String[] args) {
        int[] list = new int[]{-1,0,1,2,-1,-4};
        System.out.println(threeSum(list));
    }
    public static List<List<Integer>> threeSum(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        HashSet<List<Integer>> nonDupList = new HashSet<>();

        for(int num : nums) set.add(num);

        for (int num : set) {
            int[] pair = twoSum(nums, -num);
            if (pair != null) {
                ArrayList<Integer> trip = new ArrayList<>();
                trip.addAll(List.of(num, pair[0], pair[1]));
                Collections.sort(trip);
                nonDupList.add(trip);
            }
        }
        return new ArrayList<>(nonDupList);
    }
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
            if(map.containsKey(target - nums[i]) && (target - nums[i]) != nums[i]){
                return new int[]{nums[i],target - nums[i]};
            }
        }
        return null;
    }
}