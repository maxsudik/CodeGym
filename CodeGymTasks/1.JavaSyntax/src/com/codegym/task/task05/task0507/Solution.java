package com.codegym.task.task05.task0507;

/* 
Arithmetic mean

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double mean;
        int sum=0;
        int count=0;
        while(true){
            int number = Integer.parseInt(reader.readLine());
            if(number!=-1){
                sum+=number;
                count++;
            }else break;
        }
        mean = (double)sum/count;
        System.out.println(mean);

    }
}

