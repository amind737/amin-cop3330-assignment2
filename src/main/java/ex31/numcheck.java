/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dharik Amin
 */
package ex31;

public class numcheck {
    public static boolean isNumeric(String input) {

        try {
            Integer.parseInt(input);
        }catch(Exception e) {
            return false;
        }
        return true;
    }
}
