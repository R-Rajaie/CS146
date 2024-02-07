package com.sjsu.cs146.extracredit.fibonacci;

public class fibonacci {
    public static void main(String[] args) {
        int fibTo = 10;
        fibonacci(fibTo);
    }
    public static void fibonacci(int n){
        int x = 0;
        int y = 1;
        for(int i = 0; i < n; i++){
            System.out.println(x);
            int temp = y;
            y += x;
            x = temp;
        }
    }
}
