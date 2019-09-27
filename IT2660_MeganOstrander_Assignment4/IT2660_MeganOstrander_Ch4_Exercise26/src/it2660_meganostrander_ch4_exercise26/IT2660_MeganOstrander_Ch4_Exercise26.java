/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it2660_meganostrander_ch4_exercise26;

/**
 *
 * @author Megan Ostrander
 */
public class IT2660_MeganOstrander_Ch4_Exercise26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create list object to hold node objects
        SinglyLinkedList A = new SinglyLinkedList();
        
        Node N1 = new Node("Liliath");
        Node N2 = new Node("Roxas");
        Node N3 = new Node("Snape");
        
        //Insert nodes into List
        A.insert(N1);
        A.insert(N2);
        A.insert(N3);
        
        //print list for testing; outputs in reverse
        A.showAll();
        
        //additional Node object tests
        Node N4 = new Node("Hottie Tot"); //cannot do separate "" sets
        Node N5 = new Node(); //should be null
        
        A.insert(N4);
        A.insert(N5);
        
        //print list for testing; outputs in reverse
        System.out.println();
        A.showAll();
        
        String targetKey = "roxas";
        //test for fetching method DOES NOT WORK
        System.out.println();
        System.out.println(A.fetch(targetKey));
        
        //second test for fetch
        targetKey = "Roxas";
        System.out.println();
        System.out.println(A.fetch(targetKey));
        
        //Note: compare method is case sensitive, need to fix that
        
        //test for delete function
        System.out.println();
        System.out.println(A.delete(targetKey)); //works!!
        
        //print list after deletion
        System.out.println();
        A.showAll();
        
        
        //test for update method, print afterward
        Node newNode = new Node("Sora");
        targetKey = null;
        
        System.out.println();
        System.out.println(A.update(targetKey, newNode));
        A.showAll();
        //Note: removes target node, adds new one at END of list 
        //(or beginning, however you look at it)
        
        
        //test for adding other object types to list
        //WORKS!!
        Listing A1 = new Listing ("Ruby", 26634, 3.8); 
        Node nodeA1 = new Node(A1);
        A.insert(nodeA1);
        
        //print list with new list node added
        A.showAll();
        
        //delete new entry
        targetKey = "Ruby";
        System.out.println();
        System.out.println(A.delete(targetKey));
        A.showAll(); //failed, due to extra information?
        
        //Try #2 to delete new entry
        //WORKS!
        int targetNum = 1;
        System.out.println();
        System.out.println(A.delete(targetNum));
        A.showAll();
        
        
        
    }
    
}
