package com.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Vowels and consonants

*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        // write your code here
        String input;
        String vowels = "";
        String consonants = "";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        input = reader.readLine();
        input = input.replaceAll("\\s","");

        char[] array = input.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (isVowel(array[i])) {
                vowels += array[i] + " ";
            }
            else{
                consonants += array[i] + " ";
            }
        }

        System.out.println(vowels);
        System.out.println(consonants);
    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Convert to lowercase

        for (char d : vowels)   // Look for vowels in the array
        {
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}