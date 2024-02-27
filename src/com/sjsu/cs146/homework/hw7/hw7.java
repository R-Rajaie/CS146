package com.sjsu.cs146.homework.hw7;
import java.util.*;

public class hw7 {
    public static void main(String[] args) {
        int[][] input = {
                {0, 30},
                {5, 10},
                {0, 20},
        };
        System.out.println(minMeetingRooms(input));
    }

    public static int minMeetingRooms(int[][] intervals) {
        int len = intervals.length;
        int cntr = 0;

        int[] starts = new int[len];
        int[] ends = new int[len];

        for(int i = 0; i < len; i++){
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }

        Arrays.sort(starts);
        Arrays.sort(ends);

        int k = 0;
        for(int j = 0; j < len; j++){
            if(starts[j] < ends[k]) cntr++;
            else k++;
        }
        return cntr;
    }
}
