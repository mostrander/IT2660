/*
 * Outline for class provided by instructor.
 */
package it2660_meganostrander_ch4_exercise26;

/**
 *
 * @author Megan Ostrander
 */
public class Node {
    
    private String value; //key field?
    Node next;
    Node last;
    
    public Node() //default constructor
    {
        value = null;
    }
    
    public Node(String value)
    {
        this.value = value;
    }
    
    public Node (Object newNode)
    {
        this.value = newNode.toString();
    }
    
    public String getValue()
    {
        return this.value;
    }
    
    public void setValue(String value)
    {
        this.value = value;
    }
    
    public Node getNextNode()
    {
        return this.next;
    }
    
    public void setNextNode (Node nextNode)
    {
        this.next = nextNode;
    }
    
    public boolean compareTo(String targetKey)
    {
        System.out.println("Locating " + targetKey + " ..."); //test
        
        if(this.value == targetKey) //changed to this and worked!
            return true;
        else
            return false;
            
    }
    /* Note: Previous compareTo had "this.value.compareTo(targetKey) == 0 as 
        the test, but that must have been wrong? Perhaps because it called itself?
    */
    
    public String toString()
    {
        return (value);
    }
    
    
    
}
