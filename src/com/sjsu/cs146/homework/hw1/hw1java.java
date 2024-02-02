package com.sjsu.cs146.homework.hw1;

/*
A phrase is a palindrome if,
after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
it reads the same forward and backward.
Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
 */

public class hw1java {
    public static void main(String[] args) {
        String s = "Abb--a";
        System.out.println(s + " is palindrome: ");
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s){
        s = s.toLowerCase();

        for(int i = 0; i < s.length(); i++){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                s = s.substring(0, i) + s.substring(i + 1);
            }
        }
        return isPalindromeRecurse(s);
    }
    public static boolean isPalindromeRecurse(String s){
        if(s.length() <= 1){
            return true;
        }
        else{
            if(s.charAt(0) == s.charAt(s.length() - 1)){
                return isPalindrome(s.substring(1, s.length() - 1));
            }
            else{
                return false;
            }
        }
    }
}
