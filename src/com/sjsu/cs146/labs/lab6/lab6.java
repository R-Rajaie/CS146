package com.sjsu.cs146.labs.lab6;

import java.util.*;

public class lab6 {
    public static void main(String[] args) {
        int[][] prereqs = {
                {0,1},
                {1,0}
        };
        System.out.println(canFinish(2, prereqs));
    }
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegrees = new int[numCourses];
        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < prerequisites.length; i++){
            int a =  prerequisites[i][0];
            int b = prerequisites[i][1];

            if(map.containsKey(b)) map.get(b).add(a);

            else{
                List<Integer> list = new ArrayList<>();
                list.add(a);
                map.put(b, list);
            }

            indegrees[a]++;

        }

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < numCourses; i++) if(indegrees[i] == 0) queue.offer(i);

        int completed = 0;
        while(!queue.isEmpty()){
            int clas = queue.poll();
            completed++;

            if(map.containsKey(clas)){
                List<Integer> list = map.get(clas);
                for(int i : list){
                    indegrees[i]--;
                    if(indegrees[i] == 0) queue.offer(i);
                }
            }
        }

        return completed == numCourses;
    }
}
