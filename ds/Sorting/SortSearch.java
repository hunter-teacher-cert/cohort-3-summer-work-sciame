
import java.io.*;
import java.util.*;

/*

Sort Project:

Part 1:  (BASIC)
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortProjectDriver.java and SortProject.java) and confirm
  the behavior of the constructors.

  Part 2: (BASIC)
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortProjectDriver to test.

  Part 3: (INTERMEDIATE)
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortProjectDriver to test.



Search Project:
  1. Complete the linear search (BASIC)
  2. Complete the binary search (Intermediate)
  3. Complete the recursive version of binary search (Advanced)
*/

public class SortSearch{

    /* Sort project starts here */
    
    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    
    private Random r; 

    
    public SortSearch(){
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<15;i++){
	    data.add(r.nextInt(20)); // add 15 random numbers to an array list. The numbers will be 0-19 to choose from 
	}
	
    }
    
    public SortSearch(int size){
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<size;i++){
	    data.add(r.nextInt(20));// same as above but the size can be different depending on what size is passed through 
	}
	
    }

    /* Convenience function to get data out of the ArrayList from the driver */
    public int get(int index){
	return this.data.get(index);
    }
    


    /*
      return the index of the smallest data idem from index start to the end
      of the ArrayList. If there are multiple of the smallest value,
      return any of them.
      
      Example, if the arraylist has:
      5,3,10,6,8
      if start was 2 (start at index 2, value 10) then it would return 3
      which is the index of the value 6 which is the index with the
      smallest value from start to end

      On the other hand, if start was 0, then the method would
      return 1 since the value 3 is in index 1 and that is the smallest.
      
    */
  
    public int findSmallestIndex(int start){
      //initiate a smallIndex variable to the argument passed when findSmallestIndex is found...typically when this method is called it will start at the 0 position (see the SortSearchDriver.java test for this method in the other driver file)
	int smallIndex = start;
      //for loop runs through the length of the data.
	for(int i = start; i < data.size(); i++){
    if(data.get(i) < data.get(smallIndex)){ //if the data at position i is less than the data at the previously smallIndex....
      smallIndex = i; //set the small index to the current smaller index value (this keeps getting updated once a smaller number is found)
    } 
  }
	return smallIndex;
    }


    /**
       Implement the selection sort algorithm by sorting the ArrayList
       data in place.

       Algorithm:
       Loop a variable that represents the ArrayList index from
       0 to the end of the ArrayList.
         For each index, find the smallest from that Location
	 to the end of the array and swap it with that index.

	 
       

    */
  //this sort() method will put an array list of integers in order from smallest to largest...
    public void sort(){
    //using a for(){} loop to start the sort process
    for(int i = 0; i < data.size()-1; i++){
      int swapIndex = findSmallestIndex(i);//sets smallest index to be stored in the swapIndex variable, this is made easier by calling findSmallestIndex() method from above...
      int temp = data.get(i); //temp variable to get smallest number 
      data.set(i, data.get(swapIndex)); //put the smallest number at the front of the list
      data.set(swapIndex, temp); //put the number that was originally at the front where the smallest number USED to be
      
      
    }
  }
    //nested loop? (outside w/ find the smallest, inner loop sorts)...findSmallestIndex() uses a 
    
    //compare each index to the start, if it is smaller than switch places.

      //psuedocode: searches through the list for the lowest value. When it finds it - it swaps the lowest value into the position of the current index

      /* 
Below is an idea that ended up being too many steps...
if(data.get(findSmallestIndex(i))< data.get(i)){
currentValue = data.get(i);
swapValue = data.get(findSmallestIndex(i));
data.set(i)


 currentValue = data.get(i);
        swapValue = data.get(findSmallestIndex(i));
        data.set(i) = swapValue;
        data.set(findSmallestIndex(i)) = currentValue;
}
*/
      
    

    



    /* Search project starts here */
    
    /**
       performs a linear search. Returns the index of the first occurence of
       value in the ArrayList data or -1 if not found.

       This works by starting at the first element and searching one element at a time 
       until either the element is found or you've looked at all the elements.

       This algorithm works on any ArrayList.

    */
    public int linearSearch(int value){
	
	
	return 0; // replace this return
    }
    
    /**
       Implement a binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */
    public int binarySearch(int value){

	// create assign variables  representing the high, low and middle indices 
	// while we're not done:
	//   if the item is at data.get(middle), return middle
	//   otherwise, update high, low, and middle

	return 0;
	    
    }
    
    /**
       Implement a RECURSIVE binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */

    public int binarySearchRecursive(int value, int lowIndex, int highIndex){

	// refer to class discussion
	
	return 0;
	    
    }
    
	
    public String toString(){
	return ""+data;
    };


    public void builtinSort(){
	Collections.sort(data);
	
    }
    

    
}
