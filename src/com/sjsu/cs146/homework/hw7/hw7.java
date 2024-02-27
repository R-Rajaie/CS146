package com.sjsu.cs146.homework.hw7;
import java.util.*;

public class hw7 {
    public static void main(String[] args) {
        int[][] input = {
                {0,30},
                {5,10},
                {15,20},
        };
        minMeetingRooms(input);
    }
    public static int minMeetingRooms(int[][] intervals){
        Arrays.sort(intervals, 0, intervals.length - 1);

        return 0;
    }
}
/*
        for (int[] i: intervals) {
            System.out.print("[");
            for (int j: i) System.out.println(j + ", ");
            System.out.println("], ");
        }
 */