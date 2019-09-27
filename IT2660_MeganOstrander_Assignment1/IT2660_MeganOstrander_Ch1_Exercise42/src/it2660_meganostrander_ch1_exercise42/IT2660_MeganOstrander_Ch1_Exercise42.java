/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it2660_meganostrander_ch1_exercise42;

/**
 *
 * @author Megan Ostrander
 */
public class IT2660_MeganOstrander_Ch1_Exercise42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create an array of OBJECTS using Listing Class
        Listing [] members = new Listing[3];
        
        System.out.println("Please enter information for three members: ");
        
        //create loop for creating Listing objects, prompt for user input
        for (int i = 0; i < 3; i++)
        {
            members[i] = new Listing();
            members[i].input();
            System.out.println();
        }
        
        //output information for verification, TEST as loop
        /*
        for (int i = 0; i < 3; i++)
        {
            System.out.println(members[i]);
        }
        */
        
        //output information to console in REVERSE
        for (int i = 2; i >= 0; i-- )
        {
            System.out.println(members[i]);
        }
    }
    
}
