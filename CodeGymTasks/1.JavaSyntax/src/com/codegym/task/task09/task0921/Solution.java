package com.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Method in a try-catch

*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //write your code here
        LinkedList<Integer> list = new LinkedList();

            try{
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                while(true){
                    list.add(Integer.valueOf(reader.readLine()));
                }

            }
            catch(IOException e){

            }
            catch(NumberFormatException e){
                for (Integer number : list){
                    System.out.println(number);
                }
            }
    }
}
