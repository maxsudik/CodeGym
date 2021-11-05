package com.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Streets and houses

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        int oddNumPeople = 0;
        int evenNumPeople = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        for(int i=0; i<array.length; i+=2){
            evenNumPeople += array[i];
        }

        for(int i=1; i<array.length; i+=2){
            oddNumPeople+=array[i];
        }

        if(oddNumPeople>evenNumPeople){
            System.out.println("Odd-numbered houses have more residents.");
        } else System.out.println("Even-numbered houses have more residents.");


    }
}
