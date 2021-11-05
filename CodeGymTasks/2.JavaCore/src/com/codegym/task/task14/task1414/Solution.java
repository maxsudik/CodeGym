package com.codegym.task.task14.task1414;

/* 
MovieFactory

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Read several keys (strings) from the console. Item 7
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key = "";

        while (true) {

            Movie movie = null;
            key = reader.readLine();
            boolean condition = key.equals("cartoon") || key.equals("thriller") || key.equals("soapOpera");

            movie = MovieFactory.getMovie(key);

            if (condition) {
                System.out.println(movie.getClass().getSimpleName());
            } else{
                break;
            }
        /*
            8. Create a variable movie in the Movie class, and for each entered string (key):
            8.1. Get an object using MovieFactory.getMovie and assign it to the variable movie.
            8.2. Display the result of calling movie.getClass().getSimpleName().
        */

        }
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            // Create a SoapOpera object for the key "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            } else if ("thriller".equals(key)) {
                movie = new Thriller();
            }
            //write your code here. Items 5, 6

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    // Write your classes here. Item 3

    public static class Cartoon extends Movie {

    }

    public static class Thriller extends Movie {

    }
}
