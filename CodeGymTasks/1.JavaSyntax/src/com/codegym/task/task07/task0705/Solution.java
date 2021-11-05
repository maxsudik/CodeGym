package com.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
One large array and two small ones

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        int[] array2 = new int[10];
        int[] array3 = new int[10];

        for (int i = 0; i < array.length; i++) {
            if (i < 10) {
                array2[i] = array[i];
            } else{
                array3[i-10] = array[i];
                System.out.println(array3[i-10]);
            }

        }

    }
}
