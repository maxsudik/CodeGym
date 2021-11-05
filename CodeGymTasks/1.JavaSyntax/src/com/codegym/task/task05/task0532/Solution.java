package com.codegym.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int maximum = Integer.MIN_VALUE;


        for (int i = 0; i < number; i++) {
            int value = Integer.parseInt(reader.readLine());
            if (value > maximum) {
                maximum = value;
            }

        }
        if(number>0){
            System.out.println(maximum);
        }

    }
}
