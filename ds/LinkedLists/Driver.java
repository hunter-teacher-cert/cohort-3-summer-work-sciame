import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.add("Wayne"); // add new element at head of array
    l.add("Stacy");
    l.add("Nicole");
    l.add("Greg");
    l.add("Randy");
    l.add("Luca");
    l.add(3,"Kevin");  // intermediate add() allows position and element
    
    
    System.out.println(l);
    System.out.println("At index 3 is: "+l.get(3));
    System.out.println("At index 0 is: "+l.get(0));
    System.out.println("This Linked List has "+l.size()+" things in the list");
    System.out.println("This element is located at " + l.indexOf("Stacy"));
    
  }
}