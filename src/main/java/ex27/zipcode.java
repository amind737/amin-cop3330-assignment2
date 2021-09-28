/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dharik Amin
 */
package ex27;

public class zipcode {

    public static boolean validateZipCode(String zip) {
        boolean status = true;
        try {
            int number = Integer.parseInt(zip);
            if (zip.length() != 5) {
                System.out.println("The zipcode must be a 5 digit number.");
                status = false;
            }
        } catch (Exception e) {
            System.out.println("The zipcode must be a 5 digit number.");
            status = false;
        }
        return status;
    }
}
