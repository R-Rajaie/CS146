package com.sjsu.cs146.extracredit;

/*
Write a program to calculate Pi to a specified number of decimal places using the Leibniz formula:
π = 4 * (1 - (1/3) + (1/5) - (1/7) + ...).
Take an integer input n for the number of decimal places.
Use a loop or recursion to calculate the terms of the series and a variable to keep track of the current estimate of π.
Use a data type that can handle many decimal places.
 */

import java.util.Scanner;
import java.math.BigDecimal;

public class pi {
    public static double count = 1;
    public static BigDecimal num = new BigDecimal("4");

    public static void main(String[] args) {
        System.out.println("Enter number of pi decimal places: ");
        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();
        findPi(n);
    }

    public static void findPi(int n){
        System.out.println(n);
        while(num.toString().length() < n){
            System.out.println(num);
            num = num.subtract(new BigDecimal(4/count));
            count += 2;
        }
    }
}
