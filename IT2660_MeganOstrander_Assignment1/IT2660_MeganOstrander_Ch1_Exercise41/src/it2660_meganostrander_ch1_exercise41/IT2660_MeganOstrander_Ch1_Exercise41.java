/*
 * Assignment 1, Ch 1 Exercise 41. Create Class Listing and a driver class to
 *          test each method and constructor within the Class.
 */
package it2660_meganostrander_ch1_exercise41;

import java.util.Scanner;

/**
 *
 * @author Megan Ostrander
 */
public class IT2660_MeganOstrander_Ch1_Exercise41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //variables for passing information to Class Listing
        String name;
        String age;
        
        //Scanner to accept user input from keyboard
        Scanner keyboard = new Scanner(System.in);
        
        //test toString method with NO information, empty constructor test
        Listing member = new Listing();
        
        //Remember to print to console or it won't show!
        System.out.println(member.toString()); 
        
        //test input() method, output to check
        member.input();
        System.out.println(member.toString());
        System.out.println();
        
        //test toString method with information sent to constructor
        Listing member2 = new Listing("Linda", 26);
        System.out.println(member2.toString());
        System.out.println();
        
        //Create new blank member3 to test setName & setAge methods
        Listing member3 = new Listing();
        System.out.println(member3.toString());
        
        System.out.println("Please enter member name: ");
        name = keyboard.nextLine();
        member3.SetName(name);
        
        System.out.println("Please enter member age: ");
        age = keyboard.nextLine();
        member3.SetAge(age);
        
        System.out.println();
        System.out.println(member3.toString());
        
        System.out.println();
        
        //test for getName & getAge methods
        System.out.println("Each members' age is as follows: ");
        System.out.println(member.getName() + ": " + member.getAge());
        System.out.println(member2.getName() + ": " + member2.getAge());
        System.out.println(member3.getName() + ": " + member3.getAge());
        
    }
    
}
