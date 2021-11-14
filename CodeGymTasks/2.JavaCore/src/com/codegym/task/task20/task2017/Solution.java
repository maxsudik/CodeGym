package com.codegym.task.task20.task2017;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* 
Deserialization

*/

public class Solution {
    public static void main(String[] args) {

    }

    public A getOriginalObject(ObjectInputStream objectStream) {

        try {
            if (objectStream.readObject() == null) {
                return null;
            } else {
                return (A) objectStream.readObject();
            }
        } catch (Exception e) {
            return null;
        }
    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }
}
