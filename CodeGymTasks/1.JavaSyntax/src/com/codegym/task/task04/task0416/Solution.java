package com.codegym.task.task04.task0416;

/* 
Crossing the road blindly

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine());
        while(t>=5.0){
            t=t-5;
        }
        if(t<3.0 && t>=0){
            System.out.println("green");
        } else if(t<4.0 && t>=3.0){
            System.out.println("yellow");
        } else if(t<5.0 && t>=4.0){
            System.out.println("red");
        } else {

        }

    }
}