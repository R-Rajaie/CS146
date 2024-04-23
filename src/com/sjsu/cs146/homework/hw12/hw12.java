package com.sjsu.cs146.homework.hw12;
import java.util.*;

public class hw12 {
    public static void main(String[] args) {
        // minimum spanning tree
    }
    public static int minCostToSupplyWater(int n, int[] wells, int[][] pipes){
        int[][] nums = Arrays.copyOf(pipes, pipes.length + n);
        for (int i = 0; i < n; i++) nums[pipes.length + i] = new int[] {0, i + 1, wells[i]};
        Arrays.sort(nums, (a, b) -> a[2] - b[2]);
        int[] p = new int[n + 1];
        for (int i = 0; i <= n; i++)  p[i] = i;
        int ans = 0;
        for (var x : nums) {
            int a = x[0], b = x[1], c = x[2];
            int pa = find(a, p), pb = find(b, p);
            if (pa != pb) {
                p[pa] = pb;
                ans += c;
                if (--n == 0) {
                    return ans;
                }
            }
        }
        return ans;
    }

    public static int find(int x, int[] p){
        if (p[x] != x) {
            p[x] = find(p[x], p);
        }
        return p[x];
    }
}
