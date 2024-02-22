package com.sjsu.cs146.homework.hw6;
import java.util.*;

public class hw6 {
    public static void main(String[] args) {
        int[] list = new int[]{-1,0,1,2,-1,-4,2};
        System.out.println(threeSum(list));
    }
    public static List<List<Integer>> threeSum(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        HashSet<List<Integer>> nonDupList = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int n : nums) list.add(n);

        for(int num : nums) set.add(num);

        for (int num : set) {
            list.remove(Integer.valueOf(num));
            int[] pair = twoSum(list, -num);
            if (pair != null) {
                ArrayList<Integer> trip = new ArrayList<>(List.of(num, pair[0], pair[1]));
                Collections.sort(trip);
                nonDupList.add(trip);
            }
        }
        return new ArrayList<>(nonDupList);
    }
    public static int[] twoSum(ArrayList<Integer> nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.size(); i++){
            map.put(nums.get(i), i);
            if(map.containsKey(target - nums.get(i)) && (target - nums.get(i)) != nums.get(i)){
                return new int[]{nums.get(i),target - nums.get(i)};
            }
        }
        return null;
    }
}