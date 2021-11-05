package com.codegym.task.task04.task0428;

/* 
Positive number

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
        int count =0;

        if(a>0){
            count++;
        } if(b>0){
            count++;
        } if(c>0){
            count++;
        }
        System.out.println(count);



    }
}
