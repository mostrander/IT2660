/*
 * A project that creates a sorted array that stores objects from the 
 *      StudentListings class, allows user to specify array size, and display
 *      array in sorted order.
 */
package it2660_meganostrander_ch2_exercise20;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 *
 * @author Megan Ostrander
 */
public class IT2660_MeganOstrander_Ch2_Exercise20 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String n; //key field (name)
        String studentNum; //student id number
        String a; //student grade point average
        String targetKey; //for searching objects
        int s; //size specified by user for array
        
        //create placeholder object for new entries into array
        StudentListings newNode = new StudentListings();
        
        
        //variable for accepting user input
        Scanner keyboard = new Scanner (System.in);
        
        //test to create default array
        System.out.println("Default constructor test");
        SortedArray Class1 = new SortedArray();
        
        //insert new entries into array
        System.out.println("Test for entering 10 objects into default array");
        int i = 0;
        while (i < 3) //default size for default constructor
        {
            newNode.manualInput();
            System.out.println("\nYou entered: \n" + newNode.toString());
            
            System.out.println(Class1.insert(newNode));
            i++;
        }
        
        
        //test array showAll() method
        //Resolved
        System.out.println("\nPrinting class list: ");
        Class1.showAll();
        
        
        //test for delete() method
        System.out.println("Test for deleting object from array.");
        System.out.println("Please enter the name you wish to delete: ");
        targetKey = keyboard.nextLine();
        
        System.out.println(Class1.delete(targetKey));
        
        //reprint array to show successful delete
        System.out.println("\nPrinting class list: ");
        Class1.showAll();
        
        
        //test array expand
        System.out.println("Testing expand method for array");
        System.out.println("Please enter size for expanded array: ");
        s = keyboard.nextInt();
        
        Class1.expand(s);
        
        System.out.println("Printing new array.");
        Class1.showAll();
        
        
        //test for inserting more elements into expanded array
        System.out.println("test to add more data to array (2)");
        
        for (int j = 0; j < 2; j++)
        {
            newNode.manualInput();
            System.out.println("\nYou entered: \n" + newNode.toString());
            
            System.out.println(Class1.insert(newNode));
        }
        
        System.out.println("Printing array.");
        Class1.showAll();
        
        
        
        //NEED SORT () method!!
        //test for sort method
        //Class1.sort(Class1);
        //Class1.showAll();
        
        
        //exit program
        System.exit(0);
    }
    
}
