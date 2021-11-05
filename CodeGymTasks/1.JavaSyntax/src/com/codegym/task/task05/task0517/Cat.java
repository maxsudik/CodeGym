package com.codegym.task.task05.task0517;

/* 
Creating cats

*/

public class Cat {
    //write your code here

    String name;
    int weight;
    int age;
    String address;
    String color;

    public Cat(String name){
        this.name = name;
        this.weight = 2;
        this.age = 2;
        this.color = "Blue";
    }

    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Black";
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 4;
        this.color = "White";
    }

    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 6;
    }

    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 7;
    }

    public static void main(String[] args) {

    }
}
