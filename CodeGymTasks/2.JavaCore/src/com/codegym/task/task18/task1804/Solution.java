package com.codegym.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Rarest bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        int[] byteCountArray = new int[256];
        try (FileInputStream file = new FileInputStream(fileName)) {
            while (file.available() > 0) {
                byteCountArray[file.read()] += 1;
            }
        }
        int minCount = Integer.MAX_VALUE;

        for (int byteCount : byteCountArray) {
            if (byteCount > 0 && byteCount < minCount) {
                minCount = byteCount;
            }
        }
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < byteCountArray.length; i++) {
            if (byteCountArray[i] == minCount) {
                resultList.add(i);
            }
        }
        for (Integer count : resultList) {
            System.out.print(count + " ");
        }
    }
}

