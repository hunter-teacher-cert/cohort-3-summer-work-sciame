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
    //nested loop? (outside w/ find the smallest, inner loop sorts)...findSmallestIndex() uses a loop...so it is kind of nested in that regard...
    
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

      //we need a loop to traverse the array
      for(int i=0; i < data.size(); i++){
        if(value == data.get(i)){
          return i;
        }
          
      }
      //we can use a for() loop since we know the .size()
      //we will compare the value at each index to our search value (parameter), will return the index of the value
      //otherwise, return -1
	
	return -1; // replace this return
    }
    
    /**
       Implement a binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */
    public int binarySearch(int value){

	// create assign variables  representing the high, low and middle indices
      int highIndex = data.size() - 1;
      int lowIndex = 0;
      int midIndex;
      
	// while we're not done...
  //while the value we want is not the middle value:
  //while lowIndex is less than high
      while(lowIndex <= highIndex) {
        midIndex = (highIndex + lowIndex)/2;
        if(value == data.get(midIndex)){
          return midIndex;
          
        } else if (value < data.get(midIndex)){
          highIndex = midIndex - 1;
        } else {
          lowIndex = midIndex + 1;
        }
      }
  
	//   if the item is at data.get(midIndex), return middle
        //if value == data.get(midIndex), return middle
        //
      
	//   otherwise, update high, low, and middle

	return -1;
	    
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
    
    /* Merge Sort Stuff after here */
    /**
       Builds and returns an ArrayList that's already in increasing order.

       You can use this method to test your merge method.

    */
    public ArrayList<Integer> buildIncreasingList(int size){
	ArrayList<Integer>  newlist = new ArrayList<Integer>();
	Random r = new Random();
	int nextval = r.nextInt(20)+1;
	for (int i=0;i<size;i++){
	    newlist.add(nextval);
	    nextval = nextval + r.nextInt(20);
	}

	return newlist;
	}

    /**
       this routine should create and return a new ArrayList of
       integers and fill it by merging list1 and list2 into the new
       list.

       list1 and list2 are already sorted in increasing order.

       Example:
       If list1 contains [1,5,17,25]
       and list2 contains [3,6,10,30,40,50]

       The new list will contain:
       [1, 3, 5, 6, 10, 17, 25, 30, 40, 50]

       
    */
  public ArrayList<Integer> mergeSort(ArrayList<Integer> list){
int size = list.size();
    
    // check for base case
if(size < 2){
  return list;
} else {// if not the base case
    ArrayList<Integer> listA = new ArrayList<Integer>(list.subList(0,size/2)); 
    //creates new list variables to fill after we split orignal list for merge sort
    ArrayList<Integer> listB = new ArrayList<Integer>(list.subList(size/2,size));
        //creates new list variables to fill after we split orignal list for merge sort

    ArrayList<Integer> SortedListA = mergeSort(listA);//sorts list a  // meregSort the left half
    ArrayList<Integer> SortedListB = mergeSort(listB);//sorts list b
  
    ArrayList<Integer> MergedList = merge(SortedListA, SortedListB);// merge them together into a new list
  
    return MergedList;
}
      
      
     
      
      // return that new list 

  }


  public void msort(){
      data =  mergeSort(data);
  }


  
    public ArrayList<Integer> merge(ArrayList<Integer> list1,
				    ArrayList<Integer> list2){

      ArrayList<Integer> merged = new ArrayList<Integer>();
      
	// code for merge
  // keep comparing the first items of list1 & list2
  //taking the smaller for the new merged list
  //until we're done

      while(list1.size()>0 && list2.size()>0){
        if(list1.get(0) < list2.get(0)){
          //copy list1's first to merged
          //and remove it from list 1
          merged.add(list1.get(0));
          list1.remove(0);
        } else {
          //copy list2's first to merged
          //and remive it from list 2
          merged.add(list2.get(0));
          list2.remove(0);
        }
      }
        //At this point, list1 or list2 will be empty but the OTHER one will have one or more items to copy

        //this will be true until list one is empty
      while(list1.size()>0){
        merged.add(list1.get(0));
        list1.remove(0);
      }

      while(list2.size()>0){
        merged.add(list2.get(0));
        list2.remove(0);
      }
  
      
	return merged; // replace this line
    }
    
}
