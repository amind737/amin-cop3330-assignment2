/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dharik Amin
 */
package ex36;

public class print {
    public static void print()
    {
        System.out.print("Numbers: ");

        for(int i = 0; i<App.arr.size(); i++)
        {
            if(i!=App.arr.size()-1)
            {
                System.out.print(+App.arr.get(i)+", ");
            }
            else
            {
                System.out.println(App.arr.get(i));
            }
        }
    }
}
