package com.codegym.task.task15.task1507;

/* 
OOP: Method overloading

*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Filling with String objects");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m) {
        System.out.println(m);
    }

    public static void printMatrix(int m, int n) {
        System.out.println(m + " and " + m);
    }

    public static void printMatrix(Integer m) {
        System.out.println(m);

    }

    public static void printMatrix(Integer m, Integer n) {
        System.out.println(m + " and " + n);
    }

    public static void printMatrix(Integer m, int n) {
        System.out.println(m + " and " + n);
    }

    public static void printMatrix(int m, Integer n) {
        System.out.println(m + " and " + n);
    }

    public static void printMatrix(Integer m, Integer n, Object o) {
        System.out.println(m + " and " + n + " and " + o);
    }

    public static void printMatrix(int m, Integer n, Object o) {
        System.out.println(m + " and " + n + " and " + o);
    }
}
