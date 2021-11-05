package com.codegym.task.task03.task0303;

/* 
Currency exchange

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        System.out.println(convertEurToUsd(5, 1.765));
        System.out.println(convertEurToUsd(4, 8.123134));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        //write your code here
        double usd;
        return usd = eur * exchangeRate;

    }
}
