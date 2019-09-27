/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it2660_meganostrander_ch3_exercise19;

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
    
    public boolean push(Listing newNode)
    {
        if(top == size - 1)
        {
            return false; //overflow error (stack is full)
        }
        else
        {
            top = top + 1;
            data[top] = newNode.deepCopy();
            return true; //successfully added new entry to stack
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
    
    
}//end of class Stack
