import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {


	// Uncomment these to test part 1
	
	SortSearch ss = new SortSearch(20);
  System.out.println();
	System.out.println(ss);
	
		
	// Uncomment these to test part 2

	int i;
	i = ss.findSmallestIndex(0);
	System.out.println("\nss["+ i +"] = "+ss.get(i)+" : " + ss);

	i = ss.findSmallestIndex(7);
	System.out.println("\nss["+ i + "] = "+ss.get(i)+" : " + ss);
	
	// Uncomment these to test part 3
  
	System.out.println("\n"+ss);
  
	ss.sort();
	System.out.println("\n"+ss+"\n");
  
	


	int linResult = ss.linearSearch(10);
      System.out.print("A 10 was found at index: ");
      System.out.print(linResult);

      linResult = ss.linearSearch(5);
      System.out.print("A 5 is at index: ");
      System.out.println(linResult);

      int binaryResult = ss.binarySearch(10);
      System.out.print("A 10 is at index: ");
      System.out.println(binaryResult);

      binaryResult = ss.binarySearch(5);
      System.out.print("A 5 is at index: ");
      System.out.println(binaryResult);
    }
}