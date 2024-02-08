package com.sjsu.cs146.labs.lab2;

import java.util.HashMap;

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.
 */

public class lab2java {
    public static void main(String[] args) {
        String s = "abcde";
        String t = "cabde";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(sMap.containsKey(s.charAt(i))) sMap.put(s.charAt(i), sMap.get(s.charAt(i)) + 1);
            else sMap.put(s.charAt(i), 0);
        
            if(tMap.containsKey(t.charAt(i))) tMap.put(t.charAt(i), tMap.get(t.charAt(i)) + 1);
            else tMap.put(t.charAt(i), 0);
        }
        
        return sMap.equals(tMap);
    }
}
