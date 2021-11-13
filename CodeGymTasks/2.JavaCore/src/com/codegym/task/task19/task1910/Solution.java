package com.codegym.task.task19.task1910;

/* 
Punctuation

*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        BufferedReader inputStream = new BufferedReader(new FileReader(fileName1));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(fileName2));

        ArrayList<String> lines = new ArrayList<>();
        while(inputStream.ready()){
            lines.add(inputStream.readLine());
        }

        for (String line : lines) {
            String newLine = line.replaceAll("\\p{P}", "");
            outputStream.write(newLine);
        }

        reader.close();
        inputStream.close();
        outputStream.close();
    }

}
