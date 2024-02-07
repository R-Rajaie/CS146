package com.sjsu.cs146.homework.hw2;

/*
You are a product manager and currently leading a team to develop a new product.
Unfortunately, the latest version of your product fails the quality check.
Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad.
Implement a function to find the first bad version.
You should minimize the number of calls to the API.
 */

import java.util.Arrays;

public class hw2java {
    public static void main(String[] args) {
        boolean[] versions = new boolean[30];
        int firstBad = 29;

        Arrays.fill(versions, firstBad, versions.length, true);

        int version = findBad(versions);
        System.out.println("The first bad version is: " + (version + 1) + " [index: " + version + "]");
    }
    public static int findBad(boolean[] versions){
        int first = 0;
        int last = versions.length;
        while(first < last){
            int middle = first + (last - first) / 2;

            if(isBad(versions[middle])) last = middle;
            else first = middle + 1;
        }
        return first;
    }

    public static boolean isBad(boolean b){ return b; }
}
