package com.sjsu.cs146.homework.hw8;
import java.util.*;

public class hw8 {
    public static void main(String[] args) {
        String s = "ab";
        System.out.println(longestPalindrome(s));
    }
    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = s.length();
        for(int i = 0; i < s.length(); i++){
            char j = s.charAt(i);
            if(map.containsKey(j)) map.put(j, map.get(j) + 1);
            else map.put(j, 1);
        }
        for (int i : map.values()) if(i % 2 == 1) count--;
        if(count < s.length()) count++;
        return count;
    }
}