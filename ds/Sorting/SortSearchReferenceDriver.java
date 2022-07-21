import java.io.*;
import java.util.*;

public class SortSearchReferenceDriver {
    public static void main(String[] args) {


	int size = 10001;

	SortSearch ss = new SortSearch(size);

	
	
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