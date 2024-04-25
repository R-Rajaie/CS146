package com.sjsu.cs146.labs.lab8;
import java.util.*;

public class lab8 {
    public static void main(String[] args) {
        int[] coins = new int[]{1, 2, 5};
        System.out.println(coinChange(coins, 11));
    }

    public static int coinChange(int[] coins, int amount) {
        int[] table = new int[amount + 1];
        Arrays.fill(table, -1);
        table[0] = 0;
        return helper(coins, amount, table);
    }
    public static int helper(int[] coins, int amount, int[] table) {
        if (table[amount] != -1) return table[amount];

        int count = 1 << 30;

        for (int i = 0; i < coins.length; i++) {
            if (amount - coins[i] >= 0) {
                int curr = helper(coins, amount - coins[i], table);
                if (curr != 1 << 30 && curr + 1 < count) count = curr + 1;
            }
        }
        table[amount] = count;
        return table[amount];
    }
}
