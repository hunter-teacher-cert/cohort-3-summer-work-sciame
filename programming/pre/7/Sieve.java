import java.io.*;
import java.util.*;

public class Sieve {

public static void sieve(int n){
  boolean prime[] = new boolean[n+1];
  for(int i = 0; i <= n; i++){
    prime[i]= true;
  }
    for(int p = 2; p*p <= n; p++){
      if(prime[p]==true){
        for(int i = p*p; i <= n; i+=p){
          prime[i]=false;
        }
      }
    }
  
  for(int i =2; i<= n; i++){
    //System.out.println(prime[i]);
    if(prime[i]==true){
      System.out.print(i + " ");
    }
  }
}
  
public static void main(String[] args) {
  int n = 30; 
  System.out.print("The prime numbers less than or equal to ");
  System.out.println(n +" are... ");
  Sieve test_case = new Sieve();
  test_case.sieve(n);
  
    
}
  
}