package com.codegym.task.task10.task1013;

/* 
Human class constructors

*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Write your variables and constructors here
        private String firstName;
        private String lastName;
        private int age;
        private int weight;
        private int height;
        private boolean isMale;

        public Human() {
            System.out.println("Noname Human is created.");
        }

        public Human(String firstName) {
            this.firstName = firstName;
        }

        public Human(String firstName, String lastName) {
            this(firstName);
            this.lastName = lastName;
        }

        public Human(String firsName, String lastName, int age) {
            this(firsName, lastName);
            this.age = age;
        }

        public Human(String firstName, String lastName, int age, int weight) {
            this(firstName, lastName, age);
            this.weight = weight;
        }

        public Human(String firstName, String lastName, int age, int weight, int height) {
            this(firstName, lastName, age, weight);
            this.height = height;
        }

        public Human(String firstName, String lastName, int age, int weight, int height, boolean isMale) {
            this(firstName, lastName, age, weight, height);
            this.isMale = isMale;
        }

        public Human(String firstName, int age) {
            this.firstName = firstName;
            this.age = age;
        }

        public Human(String firstName, int age, int weight){
            this(firstName, age);
            this.weight = weight;
        }

        public Human(String firstName, int age, int weight, int height){
            this(firstName, age, weight);
            this.height = height;
        }

    }
}
