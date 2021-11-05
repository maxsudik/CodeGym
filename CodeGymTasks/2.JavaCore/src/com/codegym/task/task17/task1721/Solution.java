package com.codegym.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Transactionality

*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> linesForRemoval = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = consoleReader.readLine();
        String fileName2 = consoleReader.readLine();

        FileReader file1 = new FileReader(fileName1);
        BufferedReader fileReader = new BufferedReader(file1);
        String line;
        while((line = fileReader.readLine()) != null){
            allLines.add(line);
        }

        FileReader file2 = new FileReader(fileName2);
        fileReader = new BufferedReader(file2);
        while((line = fileReader.readLine()) != null){
            linesForRemoval.add(line);
        }
        Solution solution = new Solution();
        solution.joinData();
    }

    public void joinData() throws CorruptedDataException {
        if(allLines.containsAll(linesForRemoval)){
            allLines.removeAll(linesForRemoval);
        } else{
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
