import java.io.*;
import java.util.*;

public class Array {
  //powArray() method definition:
  public static void powArray(double[] array_nth, double n) {
  //print out the new array...
  for(int i = 0; i < array_nth.length; i++){
   array_nth[i] = Math.pow(array_nth[i],n);
   }
for(int i = 0; i < 10; i++){
  System.out.print("array_nth["+i+"] : " + array_nth[i]+", ");
}
    

}
  
  
/*
//histogram() method definition:
  public static void histogram(int[] hist, double n) {
  //print out the new array...
  for(int i = 0; i < array_nth.length; i++){
   array_nth[i] = Math.pow(array_nth[i],n);
   }
for(int i = 0; i < 10; i++){
  System.out.print("array_nth["+i+"] : " + array_nth[i]+", ");
}
    

}
*/
  public static void main(String[] args) {
  //create the initial array
  double[] array_initial = new double[10];
  for(int a = 0; a < 10; a++){
    array_initial[a]=a;
  }

  //print out the initial array
for(int a = 0; a < 10; a++){
  System.out.print("array_initial["+a+"] : " + array_initial[a]+", ");
}
//call the powArray method by passing in the initial array and a double value for the desired exponent...
powArray(array_initial, 2.0);

//create the int array for the histogram() method to use
  int[] array_for_hist = new int[100];
  for(int i = 0; i < 100; i++){
    array_for_hist[i]=i;
  }
  //print out the array for the histogram to use...
for(int i = 0; i < array_for_hist.length; i++){
  System.out.print("array_for_hist["+i+"] : " + array_for_hist[i]+", ");
}
}
}