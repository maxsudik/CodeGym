package com.codegym.task.task07.task0718;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Cat thomas = new Cat("Thomas");
        Cat behemoth = new Cat("Behemoth");
        Cat lionel = new Cat("Lionel Messi");
        Cat fluffy = new Cat ("Fluffy");

        Cat[] catsArray = {thomas, behemoth, lionel, fluffy};

        ArrayList<Cat> catsList = new ArrayList<>(Arrays.asList(catsArray));
        System.out.println(catsList);
    }
}
