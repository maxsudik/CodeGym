package com.codegym.task.task20.task2011;

/* 
Externalizable for apartments

*/

import java.io.*;

public class Solution {

    public static class Apartment implements Externalizable {

        private String address;
        private int year;

        /**
         * Mandatory public no-arg constructor.
         */
        public Apartment() { super(); }

        public Apartment(String addr, int y) {
            address = addr;
            year = y;
        }

        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeObject(this.address);
            objectOutput.writeInt(this.year);

        }

        public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
            this.address = (String) objectInput.readObject();
            this.year = objectInput.readInt();
        }

        /**
         * Prints out the fields used for testing!
         */
        public String toString() {
            return("Address: " + address + "\n" + "Year: " + year);
        }
    }

    public static void main(String[] args) {

    }
}
