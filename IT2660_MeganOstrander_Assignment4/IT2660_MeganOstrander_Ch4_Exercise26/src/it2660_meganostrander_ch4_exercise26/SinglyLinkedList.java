/*
 * A generic class that creates a linked list for ANY node type
 */
package it2660_meganostrander_ch4_exercise26;

/**
 *
 * @author Megan Ostrander
 */
public class SinglyLinkedList {
    
    private Node h; //list header (root?)
    private int size = 0;
    private int max;
    
    public SinglyLinkedList()
    {
        h = new Node(); //dummy node
        h.last = null; 
        h.next = null;
        max = 10;
    }
    
    public boolean insert(Node newNode)
    {
        Node n = newNode;
        if(n == null) //out of memory
            return false;
        else
        {
            n.next = h.next;
            h.next = n;
            n.last = newNode;
            size++;
            return true;
        }
        
    }
    
    //does not work
    public Node fetch(String targetKey)
    {
        Node p = h.next;
        int i = 1; //an iterator to track place in list
        while(p != null && !(p.last.compareTo(targetKey))) //issue with compare
        {
            p = p.next;
            i++;
        }
        if (p != null)
            {
                System.out.println("Listing found! Located at " + i + ".");
                return p.last;
            }
        else
        {
            return null;
        }
            
    }
    
    public boolean delete(String targetKey)
    {
        Node q = h;
        Node p = h.next;
        while(p != null && !(p.last.compareTo(targetKey)))
        {
            q = p;
            p = p.next;
        }
        if (p != null)
        {
            q.next = p.next;
            return true;
        }
        else
            return false;
    }
    
    public boolean delete(int targetNum)
    {
        Node q = h;
        Node p = h.next;
        
        int i = 1; //iterator to help find entry at number
        while (p != null && i < targetNum)
        {
            q = p;
            p = p.next;
            i++;
        }
        if (i == targetNum)
        {
            q.next = p.next;
            return true;
        }
        else
            return false;
    }
    
    public boolean update(String targetKey, Node newNode)
    {
        if (delete(targetKey) == false) //delete fail
            return false;
        else if (insert(newNode) == false) //insert fail
            return false;
        else
        {
            System.out.println("Replacing " + targetKey + " with " 
                    + newNode.getValue() + ".");
            return true;
        }
    }
    
    public void showAll()
    {
        Node p = h.next;
        int i = 1; //iterator to track place in list
        
        
        while (p != null) //continue to traverse 
        {
            System.out.println(i + " " + p.last.toString());
            p = p.next;
            i++;
        }
    }
    
    
}//end of class SinglyLinkedList
