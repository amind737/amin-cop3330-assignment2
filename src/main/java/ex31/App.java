/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dharik Amin
 */
package ex31;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int restingPulse;
        int age;


        while(true) {

            System.out.print("Resting Pulse: ");
            String input = sc.next();


            if(numcheck.isNumeric(input)) {
                restingPulse = Integer.parseInt(input);
                break;
            }else {
                System.out.println("Invalid Pulse");
            }

        }

        while(true) {

            System.out.print("Enter Age: ");
            String input = sc.next();

            if(numcheck.isNumeric(input)) {
                age = Integer.parseInt(input);
                break;
            }else {
                System.out.println("Invalid Age");
            }

        }

        System.out.println("Intensity\t" + "|" + "Rate");
        System.out.println("------------" + "|" + "--------");
        for(int intensity = 55 ; intensity <= 95 ; intensity += 5) {
            int rate = ((220 - age - restingPulse) * intensity/100) + restingPulse;
            System.out.println(intensity+"%\t\t\t"+ "| " +rate+" bpm");
        }

        sc.close();
    }

}
