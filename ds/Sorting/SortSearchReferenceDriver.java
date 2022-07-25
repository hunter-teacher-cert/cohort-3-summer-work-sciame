import java.io.*;
import java.util.*;

public class SortSearchReferenceDriver {
    public static void main(String[] args) {


	int size = 50001;

	SortSearchReference ss = new SortSearchReference(size);

	

//build a sorted arraylist list1:
ArrayList<Integer> list1 = ss.buildIncreasingList(10);
System.out.println(list1);

//build a second Arraylist list2 here:
ArrayList<Integer> list2 = ss.buildIncreasingList(15);
System.out.println(list2);
      
      
ArrayList<Integer> result = ss.merge(list1,list2);
      System.out.println(result);
      
	// printing is really slow so we don't want
	// to print when testing time.
	// System.out.println(ss);
		
	long start,elapsed;
      
//sort time
	start = System.currentTimeMillis();
	ss.sort();
 	// System.out.println(ss);
	elapsed = System.currentTimeMillis() - start;
	System.out.println("Size: " + size + " Sort time in ms: " + elapsed);
      
//linearSearch time...
      start = System.currentTimeMillis();
      ss.linearSearch(ss.get(10000));
      elapsed = System.currentTimeMillis() - start;
	    System.out.println("Size: " + size + " Linear search time (ms) for the last index: " + elapsed);
      
	//binarySearch time...      
      start = System.currentTimeMillis();
      ss.binarySearch(ss.get(10000));
      

      elapsed = System.currentTimeMillis() - start;
	    System.out.println("Size: " + size + " Binary search time (ms) for the last index: " + elapsed);
    }
}