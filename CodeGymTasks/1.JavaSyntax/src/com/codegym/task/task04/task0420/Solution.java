package com.codegym.task.task04.task0420;

/* 
Sorting three numbers

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int min=Integer.MIN_VALUE;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int array [] = {a, b, c};

        Arrays.parallelSort(array);
        for(int i=array.length-1; i>=0; i--){
            System.out.print(array[i] + " ");
        }
    }
}
