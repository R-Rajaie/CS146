// this is the most incomprehensible spaghetti piece of shit ive ever written in my life bro

package com.sjsu.cs146.homework.hw6;
import java.util.*;

public class hw6 {
    public static void main(String[] args) {
        int[] list = new int[]{-1,0,1,2,-1,-4};
        System.out.println(threeSum(list));
    }
    public static List<List<Integer>> threeSum(int[] nums){
        // make a hashset
        HashSet<Integer> set = new HashSet<>();

        // ok now a list
        ArrayList<Integer> list = new ArrayList<>();

        // fuck it make another hashset
        HashSet<List<Integer>> nonDupList = new HashSet<>();

        // we love loops. the time complexity is real cool on this one
        for(int num : nums){
            list.add(num);
            set.add(num);
        }

        // this for loop being shorter than O(n) meant something once upon a time when i cared about the efficiency
        for (int num : set) {
            list.remove(Integer.valueOf(num));

            // fuck it we need a hashmap now.
            HashMap<Integer, Integer> map = new HashMap<>();

            // this is twosum. take an advil before reading.
            for(int i = 0; i < list.size(); i++){

                // we can track the first index the number shows up. this becomes important later on.
                if(!map.containsKey(list.get(i))) map.put(list.get(i), i);

                // this used to be a twosum method that i butchered up. as you can see it went great.
                if(map.containsKey(-(num + list.get(i))) && map.get(-(num + list.get(i))) != i){
                    ArrayList<Integer> trip = new ArrayList<>(List.of(num, list.get(i), -(num + list.get(i))));
                    Collections.sort(trip);
                    nonDupList.add(trip);
                }
            }
            list.add(num);

        }
        return new ArrayList<>(nonDupList);
    }
}