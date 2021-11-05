package com.codegym.task.task07.task0716;

import java.util.ArrayList;
import java.util.Collections;

/* 
R or L

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("love"); // 1
        list.add("lyre"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        // write your code here

        ArrayList<String> newList = new ArrayList<>();
        newList.addAll(list);

        for (String element : list) {
        if(element.contains("r") && !element.contains("l")){
            newList.remove(element);
        } else if(element.contains("l") && !element.contains("r")){
            newList.add(element);
        }


        }
        return newList;
    }
}