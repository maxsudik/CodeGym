package com.codegym.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, loser, coder and programmer

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        // Here's the loop for reading the keys. Item 1
        Person person = null;
        String key = "";

        while (true) {
            // Create an object. Item 2
            key = reader.readLine();
            boolean condition = key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("programmer");
            if (!condition) break;
            
            if (key.equals("user")) {
                person = new Person.User();
            } else if (key.equals("loser")) {
                person = new Person.Loser();
            } else if (key.equals("coder")) {
                person = new Person.Coder();
            } else if (key.equals("programmer")) {
                person = new Person.Programmer();
            }
            doWork(person); // Call doWork
        }
    }

    public static void doWork(Person person) {
        // Item 3
        if (person instanceof Person.User) {
            Person.User user = (Person.User) person;
            user.live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Programmer) {
            ((Person.Programmer) person).enjoy();
        }
    }
}
