import java.io.*;
import java.util.*;

public class Max {

//You CANNOT write the following method using an enhanced for loop, because enhanced for loops are not helpful when you need to refer to the index of an array
public static int indexOfMax(int[] a){
  int max_value = a[0];
  int max_index = 0;
  for (int i = 0; i < a.length; i++){
    if(a[i] > max_value){
      max_value = a[i];
      max_index = i;
    }
  }
  return max_index;
}
  
public static void main(String[] args) {
    System.out.println();
    
}
  
}