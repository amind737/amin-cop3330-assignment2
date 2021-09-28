/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dharik Amin
 */
package ex27;

public class firstname {

    public static boolean validateFirstName(String firstName) {

        boolean status = true;

        if (firstName.length() < 1) {
            System.out.println("The first name must be at least 2 characters long.");
            status = false;
        }
        if (firstName.length() == 0) {
            System.out.println("The first name must be filled in.");
           status = false;
        }
        return status;
    }
}
