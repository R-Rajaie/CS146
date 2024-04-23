package com.sjsu.cs146.labs.lab7;
import java.util.*;


public class lab7 {
    public static void main(String[] args) {

    }

    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] graph = new int[n][n];
        int[] distances = new int[n];
        boolean[] visited = new boolean[n];

        for (var e : graph) Arrays.fill(e, 1 << 30);

        for (var e : edges) {
            int a = e[0];
            int b = e[1];
            int c = e[2];
            graph[a][b] = c;
            graph[b][a] = c;
        }
        int ans = n;
        int cnt = 1 << 30;
        for (int i = n - 1; i >= 0; i--) {
            int t = dijkstra(i, distances, n, visited, distanceThreshold, graph);
            if (t < cnt) {
                cnt = t;
                ans = i;
            }
        }
        return ans;
    }

    private int dijkstra(int u, int[] distances, int n, boolean[] visited, int distanceThreshold, int[][] graph) {
        Arrays.fill(distances, 1 << 30);
        Arrays.fill(visited, false);
        distances[u] = 0;

        for (int i = 0; i < n; ++i) {
            int k = -1;
            for (int j = 0; j < n; ++j)  if (!visited[j] && (k == -1 || distances[k] > distances[j])) k = j;
            visited[k] = true;
            for (int j = 0; j < n; ++j) distances[j] = Math.min(distances[j], distances[k] + graph[k][j]);
        }

        int cnt = 0;
        for (int d : distances) if (d <= distanceThreshold) ++cnt;
        return cnt;
    }
}

