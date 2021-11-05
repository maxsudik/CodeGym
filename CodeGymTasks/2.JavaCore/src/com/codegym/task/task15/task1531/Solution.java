package com.codegym.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/* 
Factorial

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //write your code here
        String result;
        if (n < 0) {
            result = String.valueOf(0);
        } else if (n == 0) {
            result = String.valueOf(1);
        } else {
            BigDecimal numberResult = new BigDecimal(1);
            for (int i = 1; i <= n; i++) {
                numberResult = numberResult.multiply(new BigDecimal(i));
            }
            result = String.valueOf(numberResult);
        }
        return result;
    }
}
