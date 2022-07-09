import java.io.*;
import java.util.*;

public class Loops {

public static double squareRoot(double a, double x, double x1) {
    do {
      x=x1;  
      x1 = (x+(a/x)) / 2;
        
      } while (Math.abs(x-x1)>0.0001); 
  return x1;
}

public static double power(double x, int n) {
 double answer = x;
  if(n == 0){
   return 1;
 } else {
   for(int i=1; i<n; i++){
     answer = answer * x;
   }
   } 
   return answer;
 }
 

  
public static int factorial(int n) {
  int answer = n; 
  for(int i = n-1; i>0; i--){
   answer *= i;
   }
 return answer;
}
  
public static void main(String[] args) {
    System.out.println(squareRoot(81, 40, 40));
    System.out.println(power(3, 3));
    System.out.println(factorial(5));
}
  
}