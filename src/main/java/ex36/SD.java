/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dharik Amin
 */
package ex36;

public class SD {
    public static double SD()
    {
        double sum = 0;
        double sd = 0.0;
        double mean = 0;
        int n = App.arr.size();

        for (int i = 0; i < n; i++)
        {
            sum = sum + App.arr.get(i);
        }

        mean = sum / (n);

        for (int i = 0; i < n; i++)
        {
            sd = sd + Math.pow((App.arr.get(i) - mean), 2);
        }
        return Math.sqrt(sd / n);
    }
}
