package com.codegym.task.task12.task1218;

/* 
Eat, fly, and move

*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanMove, CanEat {
        @Override
        public void move() {
            System.out.println("I'm moving");
        }

        @Override
        public void eat() {
            System.out.println("I'm eating");
        }

    }

    public class Duck implements CanMove, CanFly, CanEat {
        @Override
        public void move() {
            System.out.println("I'm moving");
        }

        @Override
        public void fly() {
            System.out.println("I'm flying");
        }

        @Override
        public void eat() {
            System.out.println("I'm eating");
        }
    }

    public class Car implements CanMove {
        @Override
        public void move() {
            System.out.println("I'm moving");
        }

    }

    public class Airplane implements CanMove, CanFly {
        @Override
        public void move() {

        }

        @Override
        public void fly() {

        }
    }
}
