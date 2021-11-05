package com.codegym.task.task04.task0442;


/* 
Adding

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;

        while(true){
            int number = Integer.parseInt(reader.readLine());
            if(number==-1){
                sum+=number;
                break;
            } else {
                sum+=number;
            }
        }
        System.out.println(sum);
    }
}
