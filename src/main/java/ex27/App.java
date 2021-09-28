/*
*  UCF COP3330 Fall 2021 Assignment 2 Solution
*  Copyright 2021 Dharik Amin
*/
package ex27;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter the last name: ");
        String lastName = input.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zip = input.nextLine();
        System.out.print("Enter the employee ID: ");
        String employeeID = input.nextLine();

        validinput.validateInput(firstName, lastName, zip, employeeID);
    }










}

