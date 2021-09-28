/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dharik Amin
 */
package ex24;
import java.util.*;
public class App {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.print("Enter the first string: ");
        String str1=sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2=sc.nextLine();
        if(anagram.isAnagram(str1,str2))
            System.out.println('"'+ str1 +'"' + " and " + '"' + str2 + '"' + " are anagrams.");
        else
            System.out.println('"' +str1 + '"' + " and " + '"' + str2 +'"' + " are not anagrams.");


    }
}
