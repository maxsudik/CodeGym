package com.codegym.task.task08.task0824;

/* 
Make a family

*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Human> kids1 = new ArrayList<>();
        ArrayList<Human> kids2 = new ArrayList<>();
        ArrayList<Human> grandKids = new ArrayList<>();
        ArrayList<Human> blank = new ArrayList<>();
        //write your code here

        Human child1 = new Human("Chris", true, 30, blank);
        grandKids.add(child1);
        Human child2 = new Human("Jack", true, 20, blank);
        grandKids.add(child2);
        Human child3 = new Human("Jason", true, 10, blank);
        grandKids.add(child3);

        Human father = new Human("John", true, 50, grandKids);
        kids1.add(father);
        Human mother = new Human("Mer", false, 40, grandKids);
        kids2.add(mother);

        Human grandFather1 = new Human("Bob", true, 100, kids1);
        Human grandFather2 = new Human("Dong", true, 110, kids1);
        Human grandMother1 = new Human("Cindy", false, 90, kids2);
        Human grandMother2 = new Human("Sue", false, 80, kids2);



        System.out.println(grandFather1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandMother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());



    }

    public static class Human {
        //write your code here

        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;

        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
