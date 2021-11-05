package com.codegym.task.task04.task0419;

/* 
Maximum of four numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int max = Integer.MIN_VALUE;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        if(max<a){
            max=a;
        } if(max<b){
            max=b;
        } if(max<c){
            max=c;
        }if(max<d){
            max=d;
        }
        System.out.println(max);

    }
}
