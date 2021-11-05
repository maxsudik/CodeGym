package com.codegym.task.task05.task0510;

/* 
Initializing cats

*/

public class Cat {
    //write your code here
    String name;
    int age;
    int weight;
    String address;
    String color;

    public void initialize(String name){
        this.name = name;
        this.age = 5;
        this.weight = 6;
        this.color = "Black";
    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Brown";
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 7;
        this.color = "White";
    }

    public void initialize(int weight, String color){
        this.age =5;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address){
        this.age = 9;
        this.weight = weight;
        this.address = address;
        this.color = color;

    }

    public static void main(String[] args) {

    }
}
