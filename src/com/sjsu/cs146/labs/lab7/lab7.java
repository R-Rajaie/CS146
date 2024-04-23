package com.sjsu.cs146.labs.lab7;
import java.util.*;


public class lab7 {
    public static void main(String[] args) {

    }
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int [][] g = new int[n][n];
        int[] dist = new int[n];
        boolean[] vis = new boolean[n];

        for(int[] e : g) Arrays.fill(e, 1 << 30);

        for(int[] e : edges){
            int f = e[0];
            int t = e[1];
            int w = e[2];
        }
        int ans = n;
        int cnt = 1 << 30;

        for(int i = n - 1; i >= 0; i--){

        }

        return 0;
    }

    public int dijkstra(int u){
       int cnt = 0;

       return cnt;
    }
}
