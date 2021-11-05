package com.codegym.task.task04.task0417;

/* 
Do we have a pair?

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());

        if ((n1 == n2) && (n1 == n3) && (n2 == n3)) {
            System.out.println(n1 + " " + n2 + " " + n3);
        } else if (n1 == n2) {
            System.out.println(n1 + " " + n2);
        } else if (n1 == n3) {
            System.out.println(n1 + " " + n3);
        } else if (n2 == n3) {
            System.out.println(n2 + " " + n3);
        }
    }
}