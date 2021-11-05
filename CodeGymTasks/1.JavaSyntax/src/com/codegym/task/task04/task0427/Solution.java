package com.codegym.task.task04.task0427;

/* 
Describing numbers

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        if (a >= 1 && a <= 999) {
            if (a % 2 == 0 && a < 10) {
                System.out.println("even single-digit number");
            } else if (a % 2 != 0 && a < 10) {
                System.out.println("odd single-digit number");
            } else if (a%2==0 && a>9 && a<100){
                System.out.println("even two-digit number");
            } else if(a%2!=0 && a>9 && a<100){
                System.out.println("odd two-digit number");
            } else if(a%2==0 && a>99){
                System.out.println("even three-digit number");
            } else if(a%2!=0 && a>99){
                System.out.println("odd three-digit number");
            }
        }

    }
}
