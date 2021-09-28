/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dharik Amin
 */
package ex25;
import java.util.*;
public class password {
    public static void passwordValidator(String input)
    {
        int n = input.length();
        boolean hasLetter = false,
                hasDigit = false, specialChar = false;
        Set<Character> set = new HashSet<>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        for (char i : input.toCharArray())
        {
            if (Character.isLetter(i))
                hasLetter = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }


        System.out.print("The password " + "'" +input+ "'");
        if (hasDigit && hasLetter && specialChar
                && (n >= 8))
            System.out.print(" is a very strong password.");
        else if (hasLetter && hasDigit
                && (n >= 8))
            System.out.print(" is a strong password.");
        else if (hasLetter && (n<8))
            System.out.print(" is a weak password.");
        else if (hasDigit && (n<8))
            System.out.print(" is a very weak password.");
        else
            System.out.print(" is undetermined.");
    }

}
