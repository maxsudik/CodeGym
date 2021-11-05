package com.codegym.task.task04.task0429;

/* 
Positive and negative numbers

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int negativeCount = 0;
        int positiveCount = 0;

        if (a > 0) {
            positiveCount++;
        } else if(a<0){
            negativeCount++;
        }

        if (b > 0) {
            positiveCount++;
        } else if(b<0){
            negativeCount++;
        }

        if (c > 0) {
            positiveCount++;
        } else if(c<0){
            negativeCount++;
        }

        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of positive numbers: " + positiveCount);

    }
}
