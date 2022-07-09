import java.io.*;
import java.util.*;

public class Methods {

    public static boolean isDivisible(int n, int m){
        if(n%m==0){
        return true;
          } else {
          return false;
          }
        }

    public static boolean isTriangle(int a, int b, int c){
      if(a > b + c || b > a + c || c > a + b){
        return false;
      } else {
        return true;
      }
    }


    public static int ack(int m, int n){
        if(m==0){
        return n +1;
          } else if(m>0 && n==0){
          return ack(m-1,1);
          } else if(m>0 && n>0){
          return ack(m-1,ack(m,n-1));
          } else {
          return -999;
          }
        }
  
    public static void main(String[] args){
      System.out.println(isDivisible(50,5));
      System.out.println(isTriangle(3,4,5));
      System.out.println(ack(3,3));
        }
	
}