package com.sjsu.cs146.labs.lab2;

import java.util.HashMap;

public class lab2 {
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
            if(sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i), sMap.get(s.charAt(i)) + 1);
            }
            else{
                sMap.put(s.charAt(i), 0);
            }
        }

        for(int j = 0; j < t.length(); j++){
            if(tMap.containsKey(t.charAt(j))){
                tMap.put(t.charAt(j), tMap.get(t.charAt(j)) + 1);
            }
            else{
                tMap.put(t.charAt(j), 0);
            }
        }

        return sMap.equals(tMap);
    }
}
