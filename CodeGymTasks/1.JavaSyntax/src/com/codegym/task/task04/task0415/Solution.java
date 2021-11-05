package com.codegym.task.task04.task0415;

/* 
Rule of the triangle

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //System.out.println("Enter length of the first side:");
        int a = Integer.parseInt(reader.readLine());

        //System.out.println("Enter length of the second side: ");
        int b = Integer.parseInt(reader.readLine());

        //System.out.println("Enter length of the third side: ");
        int c = Integer.parseInt(reader.readLine());

        if ((a + b > c && a + c > b && b + c > a) ) {
            System.out.println("The triangle is possible.");
        } else System.out.println("The triangle is not possible.");
    }
}