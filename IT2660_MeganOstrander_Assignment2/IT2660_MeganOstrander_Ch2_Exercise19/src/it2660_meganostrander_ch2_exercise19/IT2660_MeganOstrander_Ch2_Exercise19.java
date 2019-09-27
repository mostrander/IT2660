/*
 * A project that creates a class "StudentListings" that stores information 
 *      about student objects, and tests each method for functionality.
 */
package it2660_meganostrander_ch2_exercise19;

import java.util.Scanner;

/**
 *
 * @author Megan Ostrander
 */
public class IT2660_MeganOstrander_Ch2_Exercise19 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String n; //key field (name)
        String studentNum; //student id number
        String a; //student grade point average
        String targetKey; //for searching objects
        
        
        //variable for accepting user input
        Scanner keyboard = new Scanner (System.in);
        
        //test for obtaining user input
        System.out.println("Running test for user input");
        System.out.println("Please enter student name: ");
        n = keyboard.nextLine();
        
        System.out.println("Please enter student ID number: ");
        studentNum = keyboard.nextLine();
        
        System.out.println("Please enter student grade point average: ");
        a = keyboard.nextLine();
        
        //output user input to check validity & accuracy
        System.out.println("You entered: \nName: " + n + "\n"
                + "Student ID: " + studentNum + "\nGrade Point Average: "
                        + "" + a + "\n");
        
        //test of constructors
        System.out.println("Running tests for constructor methods");
        
        StudentListings Student1 = new StudentListings(); //default 
        StudentListings Student2 = new StudentListings("Mary", "004158", "3.8");
        //uses user input from eariler as construstor input
        StudentListings Student3 = new StudentListings(n, studentNum, a);
        
        //output constructor tests using toString method
        System.out.println(Student1.toString());
        System.out.println(Student2.toString());
        System.out.println(Student3.toString());
        
        //test for deepCopy method, should clone existing object as new
        //print results after each test
        System.out.println("Running tests for deepCopy method");
        
        StudentListings Student4 = Student2.deepCopy();
        System.out.println(Student4.toString());
        Student4 = Student1.deepCopy();
        System.out.println(Student4.toString());
        
        
        //test for input method
        //Note: Works on its own, but does not function after previous print line
        //Why?
        
        System.out.println("Running test for input method");
        
        StudentListings Student5 = new StudentListings();
        Student5.input();
        System.out.println(Student5.toString());
               

        
        System.exit(0);
    }
    
}
