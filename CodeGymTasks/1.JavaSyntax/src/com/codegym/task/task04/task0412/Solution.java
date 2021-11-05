package com.codegym.task.task04.task0412;

/* 
Positive and negative numbers

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        if (number > 0) {
            number *= 2;
            System.out.println(number);
        } else if (number < 0) {
            number += 1;
            System.out.println(number);
        } else if (number == 0) {
            System.out.println(number);
        }

    }

}