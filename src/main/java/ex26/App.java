/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dharik Amin
 */
package ex26;
import java.util.*;
import java.lang.*;
import java.io.*;
public class App {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double b, i, p;

        System.out.print("What is your balance? ");
        b = scanner.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        i = scanner.nextDouble();
        i = i / 100;

        System.out.print("What is the monthly payment you can make? ");
        p = scanner.nextDouble();

        int months = PaymentCalculator.calculateMonthsUntilPaidOff(b, i, p);
        System.out.println("It will take " + months + " months to pay off this card.");
    }

    }

