package com.codegym.task.task04.task0441;


/* 
Somehow average

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if((a<b && a>c) || (a>b && a<c)){
            System.out.println(a);
        } else if(b<a && b>c || (b>a && b<c)){
            System.out.println(b);
        }else if((c<a && c>b) || (c>a && c<b)){
            System.out.println(c);
        }else if(a==b || a==c){
            System.out.println(a);
        } else if(b==a || b==c){
            System.out.println(b);
        } else if(c==a || c==b){
            System.out.println(c);
        }
        else System.out.println(a);
    }
}
