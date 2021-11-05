package com.codegym.task.task13.task1326;

/* 
Sorting even numbers from a file

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream stream = new FileInputStream(fileName);

        Scanner scanner = new Scanner(stream);
        List<Integer> evenNumbers = new ArrayList<>();

        while (scanner.hasNext()) {
            int value = scanner.nextInt();
            if (value % 2 == 0) {
                evenNumbers.add(value);
            }
        }

        Collections.sort(evenNumbers);
        for (Integer number : evenNumbers) {
            System.out.println(number);
        }

        stream.close();
        scanner.close();
    }
}
