/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dharik Amin
 */
package ex38;

import java.util.ArrayList;

public class num {
    public static Integer[] filterEvenNumbers(String list[]) {

        ArrayList<Integer> newList = new ArrayList<>();

        for(int i=0; i<list.length; i++){

            int num = Integer.parseInt(list[i]);

            if(num % 2 == 0){

                newList.add(num);
            }
        }

        Integer[] arr = new Integer[newList.size()];
        arr = newList.toArray(arr);

        return arr;
    }
}
