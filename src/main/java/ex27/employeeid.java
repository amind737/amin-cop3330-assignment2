/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dharik Amin
 */
package ex27;

import java.util.regex.Pattern;

public class employeeid {

    public static boolean validateEmployeeID(String employeeID) {

        String pattern = "[a-zA-Z]{2}[-]{1}[0-9]{4}";
        if (!Pattern.matches(pattern, employeeID)) {
            System.out.println("The employee ID must be in the format of AA-1234.");
            return false;
        }
        return true;
    }
}
