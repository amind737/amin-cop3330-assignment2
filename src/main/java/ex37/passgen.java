/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dharik Amin
 */
package ex37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class passgen {
    public static String generatePassword(int length, int special, int nums)
    {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        String specialCharacters = "!@#$%^&*";

        String numbers = "1234567890";

        Random random = new Random();


        ArrayList<Character> chars = new ArrayList<>();

        for(int i=0; i<special; i++){

            chars.add(specialCharacters.charAt(random.nextInt(specialCharacters.length())));
        }

        for(int i=0; i<nums; i++){

            chars.add(numbers.charAt(random.nextInt(numbers.length())));
        }

        for(int i=chars.size()-1; i<length; i++){

            chars.add(letters.charAt(random.nextInt(letters.length())));
        }

        Collections.shuffle(chars);


        String password = "";

        for(Character s : chars)
        {
            password += Character.toString(s);
        }

        return password;
    }
}
