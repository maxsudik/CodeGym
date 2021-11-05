package com.codegym.task.task04.task0414;

/* 
Number of days in the year

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int leapYear = 366;
        int ordinaryYear = 365;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());
        if (year % 400 == 0) {
            System.out.println("Number of days in the year: " + leapYear);
        } else if (year % 100 == 0) {
            System.out.println("Number of days in the year: " + ordinaryYear);
        } else if(year%4==0){
            System.out.println("Number of days in the year: " + leapYear);
        } else System.out.println("Number of days in the year: " + ordinaryYear);
    }
}