package com.codegym.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //write your code here
        String temp;
        for(int i=1; i<array.length; i++){
            for(int j=0; j<i; j++){
                if (isGreaterThan(array[j], array[i])){
                    temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
    }

    // String comparison method: 'a' is greater than 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
/**
 * 1 - 0
 * *****
 * 2 - 0
 * 2 - 1
 * ******
 * 3 - 0
 * 3 - 1
 * 3 - 2
 */
