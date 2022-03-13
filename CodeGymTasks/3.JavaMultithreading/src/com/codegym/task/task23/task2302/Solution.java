package com.codegym.task.task23.task2302;

/* 
Preventing overriding

*/

public class Solution {

    public static class Listener {
        public final void onMouseDown(int x, int y) {
            //do something on mouse down event
        }

        public void onMouseUp(int x, int y) {
            //do something on mouse up event
        }
    }

    public static void main(String[] args) {

    }
}
