package com.codegym.task.task08.task0814;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/* 
Greater than 10? You're not a good fit for us

*/

public class Solution {
    public static HashSet<Integer> createSet() {
        // write your code here
        HashSet<Integer> numbers = new HashSet<>();
        Random randomNumbers = new Random();

        for(int i=0; i<20; i++){
            numbers.add(randomNumbers.nextInt(1000));
        }

        return numbers;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // write your code here
        set.removeIf(n -> (n>10));
        return set;

    }

    public static void main(String[] args) {

    }
}
