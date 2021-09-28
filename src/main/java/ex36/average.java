/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dharik Amin
 */
package ex36;

public class average {
    public static double average()
    {
        double avg=0;
        for(int i=0;i<App.arr.size();i++)
        {
            avg=avg+App.arr.get(i);
        }
        avg = avg/App.arr.size();
        return avg;
    }
}
