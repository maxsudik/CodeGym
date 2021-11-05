package com.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Playing Javarella

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Integer> by3 = new ArrayList<>();
        ArrayList<Integer> by2 = new ArrayList<>();
        ArrayList<Integer> others = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            integers.add(Integer.parseInt(reader.readLine()));
        }

        for (int element : integers) {
            if (element % 3 == 0) {
                by3.add(element);
            }if (element % 2 == 0) {
                by2.add(element);
            } if(element % 2 !=0 && element % 3 !=0){
                others.add(element);
            }
        }

        printList(by3);
        printList(by2);
        printList(others);


    }

    public static void printList(List<Integer> list) {
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
