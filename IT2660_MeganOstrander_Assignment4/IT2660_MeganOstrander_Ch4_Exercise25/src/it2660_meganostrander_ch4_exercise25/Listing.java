/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it2660_meganostrander_ch4_exercise25;

import javax.swing.JOptionPane;

/**
 *
 * @author Megan Ostrander
 */
public class Listing {
    
    private String name; //key field
    private int studentID;
    private double GPA; //grade point average
    
    
    //method constructors
    //default constructor
    public Listing()
    {
        
    }
    
    //constructor for when only name is recieved; ID & GPA default 0
    public Listing(String n)
    {
        name = n;
    }
    
    //constructor for when name, ID number, and average are known
    public Listing (String n, int ID, double average)
    {
        name = n;
        studentID = ID;
        GPA = average;
    }
    
    
    //methods for retrieving object variables/data
    public void getID()
    {
        //return ID number for calling object
        System.out.println("Getting ID number ..."); //test
        System.out.println(studentID);
    }
    
    public void getName()
    {
        //return name for calling object
        System.out.println("Getting student name ..."); //test
        System.out.println(name);
    }
    
    public void getGPA()
    {
        //return grade point average for calling object
        System.out.println("Getting student GPA ..."); //test
        System.out.println(GPA);
    }
    
    
    //methods for setting or changing object variables/data
    public void setName(String n)
    {
        //set or change name variable for calling object
        System.out.println("Setting student name ..."); //test
        name = n;
    }
    
    public void setID(int ID)
    {
        //set or change ID number for calling object
        System.out.println("Setting student ID number ..."); //test
        studentID = ID;
    }
    
    public void setGPA(double average)
    {
        //set or change grade point average for calling object
        System.out.println("Setting student GPA ..."); //test
        GPA = average;
    }
    
    
    //method for comparing user input to Listing objects
    public int compareTo(String targetKey)
    {
        System.out.println("Locating " + targetKey + " ..."); //test
        return (name.compareTo(targetKey));
    }
    
    //method for creating copy of calling object
    public Listing deepCopy()
    {
        System.out.println("Copying ..."); //test
        Listing clone = new Listing(name, studentID, GPA);
        return clone;
    }
    
    //method for printing current object information/data
    public String toString()
    {
        System.out.println("Retieving the information ..."); //testing
        return ("Name: " + name + " StudentID: " + studentID + " GPA: " + GPA);
    }
    
    
    public void input()
    {
        //to hold user input prior to translating to correct variable type
        String score;
        String num;
        
        name = JOptionPane.showInputDialog("Enter a name: ");
        num = JOptionPane.showInputDialog("Enter student ID number: ");
        score = JOptionPane.showInputDialog("Enter student grade point average: ");
        
        //translate to correct variable type
        studentID = Integer.parseInt(num);
        GPA = Double.parseDouble(score);
    }
      
} //end of class Listing
