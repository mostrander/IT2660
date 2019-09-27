/*
 * The Class "Listing" for Ch 1 exercise 41.
 */
package it2660_meganostrander_ch1_exercise41;

import java.util.Scanner;

/**
 *
 * @author Megan Ostrander
 */
public class Listing {
    
    private String Name;
    private int Age;
    
    public Listing()
    {
        Name = " ";
        Age = 0;
    }
    
    public Listing(String name, int age)
    {
        this.Name = name;
        this.Age = age;
    }
    
    public void input()
    {
        //Scanner to accept user input from keyboard
        Scanner keyboard = new Scanner(System.in);
        
        //prompt for user input, store in temporary variables.
        System.out.println("Please enter member name: ");
        String name = keyboard.nextLine();
        
        System.out.println("Please enter member age: ");
        int age = keyboard.nextInt();
        
        //copy values in temporary vairables to final variables
        //needed to work in current set up
        this.Name = name;
        this.Age = age;
        
    }
    
    //methods for setting individual member data elements
    public void SetName(String name)
    {
        this.Name = name;
    }
    
    public void SetAge(String age)
    {
        //convert string value to int value
        this.Age = Integer.valueOf(age);
    }
    
    //method for returning member information (complete)
    public String toString()
    {
        return ("The member name is " + Name + ". Member age is " + Age
                + ".");
    }
    
    //method for returning member name
    public String getName()
    {
        return Name;
    }
    
    //method for returning member age
    public int getAge()
    {
        return Age;
    }
}
