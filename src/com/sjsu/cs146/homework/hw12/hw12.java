package com.sjsu.cs146.homework.hw12;
import java.util.*;

public class hw12 {
    public static void main(String[] args) {

    }
    public static int minCostToSupplyWater(int n, int[] wells, int[][] pipes){
        int[][] nums = Arrays.copyOf(pipes, pipes.length + n);
        for (int i = 0; i < n; i++) nums[pipes.length + i] = new int[] {0, i + 1, wells[i]};

        Arrays.sort(nums, (a, b) -> a[2] - b[2]);

        int[] parents = new int[n + 1];
        for (int i = 0; i <= n; i++)  parents[i] = i;
        int ans = 0;

        for (int[] x : nums) {
            int a = x[0];
            int b = x[1];
            int cost = x[2];
            int pa = find(a, parents);
            int pb = find(b, parents);

            if (pa != pb) {
                parents[pa] = pb;
                ans += cost;
                if (--n == 0) return ans;
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
