package com.codegym.task.task14.task1412;

/* 
Implement the printMainInfo method

*/

public class Solution {
    public static void main(String[] args) {
        Object obj = new Circle();
        Movable movable = (Movable) obj;
        Drawable drawable = new Rectangle();

        printMainInfo(drawable);
        printMainInfo(movable);
    }

    public static void printMainInfo(Object object) {
        //write your code here
        if (object instanceof Drawable) {
            Drawable stuff = (Drawable) object;
            stuff.draw();
        } else if (object instanceof Movable) {
            Movable stuff = (Movable) object;
            stuff.move();
        }
    }

    static interface Movable {

        void move();
    }

    static interface Drawable {
        void draw();
    }

    static class Circle implements Movable {

        public void draw() {
            System.out.println("Can be drawn");
        }

        public void move() {
            System.out.println("Can be moved");
        }

    }

    static class Rectangle implements Drawable {
        public void draw() {
            System.out.println("Can be drawn");
        }

        public void move() {
            System.out.println("Can be moved");
        }
    }
}
