package com.labs;

import java.util.*;

public class Main {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter n for an array[n]:");
        int n = in.nextInt();

        double array[] = new double[n];
        System.out.println("Enter the numbers for the array:");
        for (int i = 0; i < n; i++) { array[i] = in.nextDouble(); }
        System.out.println("Your array:");
        for (int i = 0; i < n; i++) { System.out.print(array[i] + " "); }
        System.out.println();

        double result = 1.0;
        int factorial = 1;

        for (int i = 1; i < n; i++) {
            factorial *= i;
            if (i + 1 < array[i - 1] && array[i - 1] < factorial) {
                result /= array[i - 1];
            }
        }
        System.out.println("Our result is: " + result);
    }
}
