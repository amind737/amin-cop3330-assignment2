/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dharik Amin
 */
package ex36;

import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static ArrayList<Integer> arr;

    App() {
        arr = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        String s;
        int num = 0;
        while (true) {
            System.out.print("Enter a number: ");
            s = sc.nextLine();
            if (s.equals("done")) {
                break;
            } else {
                num = 1;
                for (int i = 0; i < s.length(); i++) {
                    if (Character.isDigit(s.charAt(i))) {
                        continue;
                    } else {
                        num = 0;
                    }
                }
                if (num == 1) {
                    arr.add(Integer.parseInt(s));
                }
            }
        }
    }


        public static void main(String[] args) {

            App s = new App();
            print.print();
            assert average.average() == 400.0;
            System.out.println("The average is " + average.average());

            assert min.min() == 100;
            System.out.println("The minimum is " + min.min());

            assert max.max() == 1000;
            System.out.println("The maximum is " + max.max());

            System.out.printf("The standard deviation is %.2f", SD.SD());
        }
    }

