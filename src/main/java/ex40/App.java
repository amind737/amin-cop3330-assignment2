/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dharik Amin
 */
package ex40;
import java.util.TreeMap;
import java.util.Date;

public class App {
    static TreeMap<Integer, App> employees = new TreeMap<>();

    private String firstName;
    private String lastName;
    private String position;
    private Date separationDate;

    public App(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }
    public App(String firstName, String lastName, String position, Date separationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.separationDate = separationDate;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lasstName) { this.lastName = lasstName; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public Date getSeparationDate() { return separationDate; }
    public void setSeparationDate(Date separationDate) { this.separationDate = separationDate; }

    @Override
    public String toString() {
        return "Employee[ " + "firstName=" + firstName + ", lastName=" + lastName
                + ", position=" + position + ", separationDate=" + separationDate + " ]";
    }


    public static int search(String name){
        int count = 0;
        for(int k : employees.keySet()){
            if(employees.get(k).getFirstName().equalsIgnoreCase(name) || employees.get(k).getLastName().equalsIgnoreCase(name)){
                count++;
                System.out.println(employees.get(k));
            }
        }
        return count;
    }
}
