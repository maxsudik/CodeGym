package com.codegym.task.task06.task0614;

import java.util.ArrayList;

/* 
Static cats

*/

public class Cat {
    //write your code here
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {
    }

    public static void main(String[] args) {
        //write your code here

        for(int i=0; i<10; i++){
            cats.add(new Cat());
        }

        printCats();
    }

    public static void printCats() {
        //write your code here

        for(int i=0; i<cats.size(); i++){
            System.out.println(cats.get(i));
        }
    }
}
