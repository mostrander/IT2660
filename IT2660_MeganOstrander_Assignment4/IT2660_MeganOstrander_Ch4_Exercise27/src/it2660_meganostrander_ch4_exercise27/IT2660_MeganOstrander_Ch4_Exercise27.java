/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it2660_meganostrander_ch4_exercise27;

import java.util.Scanner;

/**
 *
 * @author Megan Ostrander
 */
public class IT2660_MeganOstrander_Ch4_Exercise27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //variables for use during program
        int entry; //used for switch statement control
        String n;
        int ID;
        double average;
        String targetKey; //for locating entries
        int targetNum;
        
        
        Listing newEntry; //to hold new listings to be added
        Node student;
        
        //create scanner object for user input
        Scanner keyboard = new Scanner(System.in);
        
        //set scanner delimiter
        keyboard.useDelimiter("\n");
        
        //create SinglyLinkedList for entries
        SinglyLinkedList List = new SinglyLinkedList(); //list of entries
        
        
        System.out.println("Please enter the number of initial entries "
                + "to enter: ");
        entry = keyboard.nextInt();
        
        for(int i = 0; i < entry; i++)
        {
            System.out.println("Please enter the name: ");
            n = keyboard.next();
            
            System.out.println("Please enter the ID number: ");
            ID = keyboard.nextInt();
            
            System.out.println("Please enter the student's grade point average: ");
            average = keyboard.nextDouble();
            
            newEntry = new Listing(n, ID, average); //creates listing with info
            student = new Node(newEntry);
            List.insert(student); //adds student node to List
        }
        
        System.out.println("Showing initial class list: ");
        List.showAll();
        
        
        //beginning of switch statements
        //loop for user input, until user exits program
        while (entry != 6)
        {
        //create switch for different user options. 
        //inform user of options etc.
        System.out.println("Please enter a number for the following options: ");
        System.out.println("1: Insert new entry \n2: Retrieve entry from list "
                + "\n3: Delete entry from list \n4: Update list "
                + "\n5: Show current list \n6: Exit program ");
        
        entry = keyboard.nextInt();
        
        switch (entry)
        {
            case 1:
                System.out.println("Please enter the name: ");
                n = keyboard.next();

                System.out.println("Please enter the ID number: ");
                ID = keyboard.nextInt();

                System.out.println("Please enter the student's grade point average: ");
                average = keyboard.nextDouble();

                newEntry = new Listing(n, ID, average);
                student = new Node(newEntry);
                List.insert(student);
                System.out.println();
                break;
            case 2: //not working
                System.out.println("Enter the name you would like to find: ");
                targetKey = keyboard.next();
                
                List.fetch(targetKey);
                System.out.println();
                break;
            case 3:
                System.out.println("Please enter the entry number to delete: ");
                targetNum = keyboard.nextInt();
                
                List.delete(targetNum);
                List.showAll();
                System.out.println();
                break;
            case 4:
                System.out.println("Please enter the entry number to update: ");
                targetNum = keyboard.nextInt();
                
                
                System.out.println("Please enter the name: ");
                n = keyboard.next();

                System.out.println("Please enter the ID number: ");
                ID = keyboard.nextInt();

                System.out.println("Please enter the student's grade point average: ");
                average = keyboard.nextDouble();

                newEntry = new Listing(n, ID, average);
                student = new Node(newEntry);
                
                
                List.update(targetNum, student);
                List.showAll();
                System.out.println();
                break;
            case 5:
                List.showAll();
                System.out.println();
                break;
            case 6:
                System.out.println("Exiting program. Thank you.");
                break;
        }
    }    
        
        
        //Quit program
        System.exit(0);
    
    }
    
}
