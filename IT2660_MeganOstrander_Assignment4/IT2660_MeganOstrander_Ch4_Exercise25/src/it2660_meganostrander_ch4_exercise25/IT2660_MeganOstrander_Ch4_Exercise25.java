/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it2660_meganostrander_ch4_exercise25;

import java.util.Scanner;

/**
 *
 * @author Megan Ostrander
 */
public class IT2660_MeganOstrander_Ch4_Exercise25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //variables for passing info to Listing class
        String n;
        int ID;
        double average;
        String targetKey; //key for locating matching object data

        //create scanner for user input
        Scanner keyboard = new Scanner(System.in);
        
        //create Listing objects for testing
        Listing student1 = new Listing("Amber"); //call 1 argument constructor
        Listing student2 = new Listing(); //call default constructor
        Listing student3 = new Listing("Riku", 14428, 4.0); //call final constructor
        
        //print all original Listing object data
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        
        
        //test for encapsulation of Listing data
        
        //cannot use object.variable because all is private currently
        //student1.name = "Lily";
        //student3.GPA = 1.5;
        //student2.studentID = 548221;
        
        student1.setGPA(2.8);
        student1.setID(114251);
        student2.setName("Rosie");
        student2.setGPA(4.3);
        student2.setID(336495);
        
        //print new information to screen
        System.out.println();
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        
        
        //test for input method
        Listing student4 = new Listing();
        student4.input();
        System.out.println(student4.toString());
        
        
        //test for key finding.
        targetKey = "Amber";
        System.out.println(student2.compareTo(targetKey));
        System.out.println(student3.compareTo(targetKey));
        System.out.println(student1.compareTo(targetKey));
        System.out.println(student4.compareTo(targetKey));
        
        targetKey = "William";
        System.out.println();
        System.out.println(student2.compareTo(targetKey));
        System.out.println(student3.compareTo(targetKey));
        System.out.println(student1.compareTo(targetKey));
        System.out.println(student4.compareTo(targetKey));
        
        
        //test for other misc methods: get methods
        student4.getGPA();
        student4.getID();
        student4.getName();
        
        
    }
    
}
