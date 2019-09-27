/*
 * A finalized program that utilizes the previous SortedArray & StudentListings
 *      classes to create a program that takes max array size, initial # of students
 *      and initial data set from user. Then, provides 6 options within a 
 *      switch loop for user to interact infinitely with program until done.
 */
package it2660_meganostrander_ch2_exercise21;

import java.util.Scanner;

/**
 *
 * @author Megan Ostrander
 */
public class IT2660_MeganOstrander_Ch2_Exercise21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int s; //used to pass array size to constructor & methods
        int entry; //number of entries, for looping
        String targetKey; //variable for locating data in array (user input)
        StudentListings newNode = new StudentListings();
        
        //create scanner object for user input
        Scanner keyboard = new Scanner (System.in);
        
        //prompt user for size of array to be created
        System.out.println("Please enter MAX size needed for list: ");
        s = keyboard.nextInt();
        
        //create sorted array using size given by user (CONSTRUCTOR)
        SortedArray Class1 = new SortedArray(s);
        
        //prompt user for number of initial students/elements
        System.out.println("Please enter number of INITIAL entries: ");
        entry = keyboard.nextInt();
        
        int i = 0;
        
        //checks size of array first.
        if (entry > s)
            {
                System.out.println("List can only hold " + s + " entries."
                        + " Please expand list for additional storage.");
            }
        else
        {
            //while i is less than ENTRY (initial number of entries)
            while (i < entry)
            {
                {
                //override information for newNode object each time & insert into array
                newNode.manualInput();
                System.out.println("\nYou entered: \n" + newNode.toString());

                Class1.insert(newNode);
                i++;
                }
            }
            
            //output initial array list for user to see
            System.out.println("Your initial list is: ");
            Class1.showAll();
        }
        
        
        //loop for user input, until user exits program
        
        while (entry != 7)
        {
        //create switch for different user options. 
        //inform user of options etc.
        System.out.println("Please enter a number for the following options: ");
        System.out.println("1: Insert new entry \n2: Retrieve entry from list "
                + "\n3: Delete entry from list \n4: Update current entry "
                + "\n5: Sort \n6: Show current list\n7: Exit program ");
        
        entry = keyboard.nextInt();
        
        switch (entry)
        {
            case 1:
                //override information for newNode object each time & insert into array
                newNode.manualInput();
                System.out.println("\nYou entered: \n" + newNode.toString());
                
                Class1.insert(newNode);
                
                break;
            case 2:
                System.out.println("Please enter name of entry you would "
                        + "like to find: ");
                targetKey = keyboard.next();
                
                Class1.fetch(targetKey);
                
                break;
            case 3:
                System.out.println("Please enter name of entry you would "
                        + "like to delete: ");
                targetKey = keyboard.next();
                
                Class1.delete(targetKey);
                
                break;
            case 4:
                System.out.println("Please enter name of entry you would "
                        + "like to find: ");
                targetKey = keyboard.next();
                
                newNode.manualInput();
                System.out.println("\nYou entered: \n" + newNode.toString());
                
                Class1.update(targetKey, newNode);
                
                break;
            case 5:
                System.out.println("Currently unable to sort list.");
                break;
            case 6:
                Class1.showAll();
                break;
            case 7:
                System.out.println("Exiting program. Thank you.");
                break;
        }
    }    
        //Quit program
        System.exit(0);
    
    }
}
