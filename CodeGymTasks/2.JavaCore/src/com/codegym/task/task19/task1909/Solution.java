package com.codegym.task.task19.task1909;

/* 
Changing punctuation marks

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

        for(String line : lines){

            String newLine = line.replaceAll("[.]", "!");
            outputStream.write(newLine);
        }

        reader.close();
        inputStream.close();
        outputStream.close();
    }
}
