/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dharik Amin
 */
package ex40;

import org.junit.jupiter.api.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void TestEmployeeMap() throws ParseException{
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        App.employees.put(101, new App("John","Johnson","Manager",s.parse("2016-12-31")));
        App.employees.put(102, new App("Tou","Xiong","Software Engineer",s.parse("2016-10-05")));
        App.employees.put(103, new App("Michaela","Michaelson","District Manager",s.parse("2015-12-19")));
        App.employees.put(104, new App("Jake","Jacobson","Programmer"));
        App.employees.put(105, new App("Jacquelyn","Jackson","DBA"));
        App.employees.put(106, new App("Sally","Webber","Web Developer",s.parse("2015-12-18")));

        Assert.assertTrue(App.employees.size() == 6);
        Assert.assertTrue(App.search("John") == 1);
    }

    @Test
    public void TestEmployeeMap2() throws ParseException{
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        App.employees.put(101, new App("John","Johnson","Manager",s.parse("2016-12-31")));
        App.employees.put(102, new App("Tou","Xiong","Software Engineer",s.parse("2016-10-05")));
        App.employees.put(103, new App("Michaela","Johnson","District Manager",s.parse("2015-12-19")));
        App.employees.put(104, new App("Johnson","Jacobson","Programmer"));

        Assert.assertTrue(App.employees.size() == 4);
        Assert.assertTrue(App.search("Johnson") == 3);
    }
}