package com.codegym.task.task07.task0724;

/* 
Family census

*/

public class Solution {
    public static void main(String[] args) {
        // write your code here

        Human grandfather1 = new Human("Gran1", true, 10);
        Human grandfather2 = new Human("Gran2", false, 15);
        Human grandmother1 = new Human("Gran3", true, 20);
        Human grandmother2 = new Human("Gran4", false, 30);

        Human father = new Human("Bob", true, 40, grandfather1, grandmother1);
        Human mother = new Human("Jen", true, 45, grandfather2, grandmother2);
        Human child1 = new Human("Bob", true, 40, father, mother);
        Human child2 = new Human("Bob", true, 40, father, mother);
        Human child3 = new Human("Bob", true, 40, father, mother);

        System.out.println(grandfather1.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother2.toString());

        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());


    }

    public static class Human {
        // write your code here
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }
}