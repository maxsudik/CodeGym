package com.codegym.task.task12.task1209;

/* 
Three methods and a minimum

*/

public class Solution {
    public static void main(String[] args) {

    }

    //write your code here
    public static int min(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }

    }

    public static long min(long a, long b) {
        if(a>b){
            return b;
        } else {
            return a;
        }
    }

    public static double min(double a, double b) {
        return (a>b) ? b : a;
    }
}
