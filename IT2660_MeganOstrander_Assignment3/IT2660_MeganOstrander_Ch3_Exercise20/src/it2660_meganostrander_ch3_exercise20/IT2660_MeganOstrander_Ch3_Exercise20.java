/*
 * Take previous Ch 3 exercise 19 project and adds an expand ability to the 
 *      stack class when overflows occur. Imported most of code from ex 19.
 *      Implements an additional getSize method to show change in stack size
 */
package it2660_meganostrander_ch3_exercise20;

import java.util.Scanner;

/**
 *
 * @author Megan Ostrander
 */
public class IT2660_MeganOstrander_Ch3_Exercise20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //variable to control switch statement
        int userInput;
        
        //variables needed for user input, passed to Listing class
        String n;
        String a;
        String num;
        
        //variable needed for stack size, passed to Stack class
        int N = 3;
        
        //create Listing class variable newNode for adding to stack
        Listing newNode;
        
        //create scanner variable to accept user input
        Scanner keyboard = new Scanner(System.in);
        
        //set delimiter for scanner
        //should be based only on enter/ new line key.
        //works!
        keyboard.useDelimiter("\n");
        
        //create stack using N size
        Stack myStack = new Stack(N);
        
        
        //test of Stack class methods combined into switch statement
        //Works!
        userInput = 0;
        
        //while loop for switch statement
        while (userInput != 8)
        {
            System.out.println("\nPlease enter one of the following numbers: ");
            System.out.println("1: Add entry to Stack \n2: Remove entry from stack "
                + "\n3: Test for empty stack \n4: Test for full stack "
                + "\n5: Reset stack \n6: Show entries in Stack \n7: Get stack size "
                    + "\n8: Exit");
            userInput = keyboard.nextInt();
            
            switch(userInput)
            {
                
                case 1:

                    System.out.println("\nPlease enter your name.");
                    n = keyboard.next();

                    System.out.println("Please enter your address.");
                    a = keyboard.next();

                    System.out.println("Please enter your phone number "
                            + "(format: #########)");
                    num = keyboard.next();

                    //send information to Listing class to create new object.
                    newNode = new Listing(n, a, num);

                    myStack.push(newNode);
                    
                   break; 
                   
                case 2:
                    System.out.println("\nRemoving data from stack.");
                    System.out.println(myStack.pop());
                    break;
                case 3:
                    System.out.println("\nTesting for empty stack.");
                    myStack.emptyStack();
                    break;
                case 4:
                    System.out.println("\nTesting for full stack.");
                    myStack.fullStack();
                    break;
                case 5:
                    System.out.println("\nReseting stack.");
                    myStack.reset();
                    break;
                case 6:
                    System.out.println("\nShowing entries in stack: ");
                    myStack.showAll();
                    break;
                case 7:
                    myStack.getSize();
                    break;
                case 8:
                    System.out.println("Exiting program. Thank you.");
                    break;

                default: System.out.println("Invalid number. Try again.");
                break;
            }//end of switch statement
        }//end of while loop
       
        
        
        //quit program
        System.exit(0);
        
        
        
    }
    
}
