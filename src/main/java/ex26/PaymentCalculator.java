/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dharik Amin
 */
package ex26;
import java.util.*;
import java.lang.*;
public class PaymentCalculator {
        public static int calculateMonthsUntilPaidOff(double b, double i, double p) {

            i = i / 365;
            return (int) Math.ceil((-1 / 30.0) * Math.log(1 + b / p * (1 - Math.pow(1 + i, 30))) / Math.log(1 + i));

        }

    }