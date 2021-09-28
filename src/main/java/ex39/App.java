/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dharik Amin
 */
package ex39;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class App {
    public static void main(String[] args)
    {
        Employee[] employees = {
                new Employee("John","Johnson","Manager","2016-12-31"),
                new Employee("Tou","Xiong","Software Engineer","2016-10-05"),
                new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19"),
                new Employee("Jake","Jacobson","Programmer"," "),
                new Employee("Jackquelyn", "Jackson", "DBA"," "),
                new Employee("Sally","Webber","Web Developer","2015-12-18")
        };

        List<Employee> list = Arrays.asList(employees);


        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;

        Comparator<Employee> lastThenFirst =
                Comparator.comparing(byLastName).thenComparing(byFirstName);
        System.out.println("Name \t \t \t \t" + "|" + " Position\t \t \t |" + " Separation Date");
        System.out.println("--------------------|--------------------|----------------");
        list.stream()
                .sorted(lastThenFirst)
                .forEach(System.out::println);
    }
}

