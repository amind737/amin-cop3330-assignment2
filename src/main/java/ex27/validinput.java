/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dharik Amin
 */
package ex27;

public class validinput {
    public static String data = "";
    public static void validateInput(String firstName, String lastName, String zip, String employeeID) {


        boolean first = firstname.validateFirstName(firstName);
        boolean last = lastname.validateLastName(lastName);
        boolean idFlag = employeeid.validateEmployeeID(employeeID);
        boolean zipFlag = zipcode.validateZipCode(zip);
        if (first && last && zipFlag && idFlag) {
            data = "There were no errors found.";
        }
        System.out.println(data);
    }
}
