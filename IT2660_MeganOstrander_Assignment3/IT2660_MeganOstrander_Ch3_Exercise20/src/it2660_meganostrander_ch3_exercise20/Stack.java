/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it2660_meganostrander_ch3_exercise20;

/**
 *
 * @author Megan Ostrander
 */
public class Stack {
    private Listing[] data;
    private int top;
    private int size;
    
    public Stack()
    {
        top = -1;
        size = 100;
        data = new Listing[100];
    }
    
    public Stack(int N)
    {
        top = -1;
        size = N;
        data = new Listing[N];
    }
    
    //modified to expand the stack size when overflow occurs.
    public void push(Listing newNode)
    {
        if(top == size - 1) //if stack is FULL
        {
            System.out.println("Resizing stack to accommadate new entry.");
            
            //create temp Listing array for resizing
            Listing [] temp = new Listing[100];

            for (int i = 0; i < data.length; i++)
            {
                temp[i] = data[i].deepCopy(); //copy to temp array
                data[i] = null; //erase data reference
            }
            
            data = new Listing[data.length + 10]; //increase size by 10;
            
            for (int i = 0; i < data.length; i++)
            {
                data[i] = temp[i]; //copy to original array
                temp[i] = null; //erase data reference
            }
            
            top = top + 1;
            data[top] = newNode.deepCopy();
        }
        
        else //if stack is NOT full
        {
            System.out.println("\nAdding new data to stack.");
            top = top + 1;
            data[top] = newNode.deepCopy();

        }
    }
    
    public Listing pop()
    {
        int topLocation;
        if (top == -1)
        {
            return null; //underflow error (nothing in stack)
        }
        else
        {
            topLocation = top;
            top = top - 1;
            return data[topLocation];
        }
    }
    
    public void showAll()
    {
        for (int i = top; i >= 0; i--)
        {
            System.out.println(data[i].toString());
        }
    }
    
    
    public void emptyStack()
    {
        if(top == -1)
        {
            System.out.println("Stack is currently EMPTY.");
        }
        else
        {
            System.out.println("The stack is not empty.");
        }
    }
    
    
    public void fullStack()
    {
        if(top == size - 1)
        {
            System.out.println("Stack is currently FULL.");
        }
        else
        {
            System.out.println("The stack is not full.");
        }
    }
    
    
    public void reset()
    {
        top = -1;
    }
    
    //returns size of data array stack
    public void getSize()
    {
        System.out.println("Size is: " + data.length);
    }
    
    
    
}//end of class Stack
