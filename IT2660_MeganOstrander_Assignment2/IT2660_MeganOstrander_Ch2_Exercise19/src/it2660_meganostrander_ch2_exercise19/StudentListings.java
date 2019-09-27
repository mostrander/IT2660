/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it2660_meganostrander_ch2_exercise19;

import javax.swing.JOptionPane;

/**
 *
 * @author Megan Ostrander
 */
public class StudentListings {
    
    private String name; //key field
    private String studentId;
    private String gradeAvg;
    
    //default constructor, no parameters
    public StudentListings ()
    {
        name = "Bob No Name";
        studentId = "000000";
        gradeAvg = "0.0";
    }
    
    //constructor for all information provided
    public StudentListings (String n, String studentNum, String a)
    {
        name = n;
        studentId = studentNum;
        gradeAvg = a;
    }
    
    
    //methods for changing object variables, shouldn't alter information
    //outside of these methods
    public void setName(String n)
    {
        name = n;
    }
    
    public void setId(String studentNum)
    {
        studentId = studentNum;
    }
    
    public void setAvg(String a)
    {
        gradeAvg = a;
    }
    
    
    //method to compare information provided with stored objects
    public int compareTo(String targetKey)
    {
        return (name.compareTo(targetKey));
    }
    
    
    //method for outputting object information
    public String toString()
    {
        return("Name: " + name + "\nStudent ID: " + studentId + "\nGrade Point "
                + "Average: " + gradeAvg + "\n");
    }
    
    
    public StudentListings deepCopy()
    {
        StudentListings Clone = new StudentListings(name, studentId, gradeAvg);
        return Clone;
    }
    
    
    public void input()
    {
        name = JOptionPane.showInputDialog("Enter a name:");
        studentId = JOptionPane.showInputDialog("Enter ID number:");
        gradeAvg = JOptionPane.showInputDialog("Enter grade average:");
    }
}
