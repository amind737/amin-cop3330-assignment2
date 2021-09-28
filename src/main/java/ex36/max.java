/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dharik Amin
 */
package ex36;

public class max {
    public static int max()
    {
        if(App.arr.size()==0)
        {
            return 0;
        }
        int m=App.arr.get(0);
        for(int i=1;i<App.arr.size();i++)
        {
            if(m<App.arr.get(i))
            {
                m=App.arr.get(i);
            }
        }
        return m;
    }
}
