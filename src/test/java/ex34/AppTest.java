/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dharik Amin
 */
package ex34;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

@DisplayName("This a Test class ")
class AppTest {

        @Test
        @DisplayName("Test add method")
        void TestAddMethod()
        {
            ArrayList<String> employees = new ArrayList<String>(Arrays.asList("John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"));
            boolean b = removeName(employees,"Chris Jones");

            Assertions.assertEquals(true,b);
        }

    private boolean removeName(ArrayList employees,String del) {
        return employees.remove(del);
    }
}