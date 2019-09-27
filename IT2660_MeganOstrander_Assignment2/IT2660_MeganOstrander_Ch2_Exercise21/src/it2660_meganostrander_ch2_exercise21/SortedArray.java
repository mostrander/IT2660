/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it2660_meganostrander_ch2_exercise21;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Megan Ostrander
 */
public class SortedArray {
    
    private int next;
    private int size;
    private StudentListings[] data;
    
    
    public SortedArray() //default constructor
    {
        next = 0;
        size = 10; //default array size
        data = new StudentListings[size];
    }
    
    
    public SortedArray(int s) //constructor using specified size
    {
        next = 0;
        size = s; //user specified array size
        data = new StudentListings[size];
    }
    
    //inserts new entry into array
    //NOTE: Should i sort here?
    public boolean insert(StudentListings newNode)
    {
        if (next >= data.length)
            return false;
        data[next] = newNode.deepCopy();
        
        if(data[next] == null)
            return false;
        next = next + 1;
        
        return true;       
    }
    
    //locates listing in array, if present
    public StudentListings fetch(String targetKey)
    {
        StudentListings node;
        
        //search for node sequentially, order array as is.
        int i = 0;
        while(i < next && !(data[i].compareTo(targetKey) == 0))
        {
            i++;
        }
        if(i == next) //node not found
            return null;
        
        //deep copy node
        node = data[i].deepCopy();
        System.out.println(node);
        return node;
    }
    
    
    public void expand(int s)
    {
        //create new array that holds X objects, copy old array to it
        StudentListings expand[] = new StudentListings[s];
        StudentListings temp[] = new StudentListings[s];
        
        temp = data; //store reference of array to be expanded
        data = expand; //data array now references larger array
        
        
        for (int i = 0; i < temp.length; i++)
        {
            data[i] = temp[i]; //copy data to expanded array
        }
        
        temp = null; //delete contents of temp array
        expand = null; //delete contents of expand array
        
    }
    
    

    public boolean delete(String targetKey)
    {
        int i = 0;
        while (i < next && !(data[i].compareTo(targetKey) == 0))
        {
            i++;
        }
        if (i == next)
            return false;
        
        data[i] = data[next - 1];
        data[next - 1] = null;
        next = next - 1;
        
        return true;
    }
    
    public boolean update(String targetKey, StudentListings newNode)
    {
        if (delete(targetKey) == false) //element not in the array
            return false;
        else if (insert(newNode) == false)
            return false;
        else
        
        return true;
    }
    
    //method to show entire array object
    public void showAll()
    {
        
        for (int i = 0; i < next; i++ )
        {
            System.out.println((i + 1) + " " + data[i].toString());
        }
        
        System.out.println("End of List");
    }
}
