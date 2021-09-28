/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dharik Amin
 */
package ex27;

public class lastname {

    public static boolean validateLastName(String lastName) {
        boolean status = true;

        if (lastName.length() < 2) {
            System.out.println("The last name must be at least 2 characters long.");
            status = false;
        }
        if (lastName.length() == 0) {
            System.out.println("The last name must be filled in.");
            status = false;
        }
        return status;
    }
}
