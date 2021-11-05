package com.codegym.task.task04.task0424;

/* 
Three numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int one = Integer.parseInt(reader.readLine());
        int two = Integer.parseInt(reader.readLine());
        int three = Integer.parseInt(reader.readLine());

        //int [] array = {one, two, three};
        if(one==two){
            System.out.println(3);
        } else if(one==three){
            System.out.println(2);
        } else if(two==three){
            System.out.println(1);
        }
    }
}
