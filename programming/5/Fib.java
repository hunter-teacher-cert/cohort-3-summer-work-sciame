/**
 * nth Fibonacci number generator by Team SumEmIfYaGotEm
 * Greg Sciame Thursday July 7th, 2022
 * collaborators: Christine Marra, Joshua Higgins, Dave Ciolino-Volano
 */

public class Fib
{

  //your implementation of fib(n) here
  static int fib1(int n){
    int cur = 1;
    int pre = 0;
    int nxt = -1;
    for (int i = 0; i < n-1; i++){
      nxt = cur + pre;
      pre = cur;
      cur = nxt;
    }
    return cur;
  }

  static int fib2(int n){
    if (n==0 || n==1){
      return n;
    }
    else {
      return fib2(n-1)+ fib2(n-2);
    }
  }

  public static void main( String[] args )
  {
    int x = 0;
    x = fib1(35);
    System.out.println("fib1: " + x);

    x = fib2(35);
    System.out.println("fib2: " + x);
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      System.out.println( fib(0) ); // -> 0
      System.out.println( fib(1) ); // -> 1
      System.out.println( fib(2) ); // -> 1
      System.out.println( fib(3) ); // -> 2
      System.out.println( fib(4) ); // -> 3
      System.out.println( fib(5) ); // -> 5
      //now go big:
      System.out.println( fib(10) ); // -> 55
      System.out.println( fib(20) ); // -> 6765
      System.out.println( fib(40) ); // -> 102334155
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }//end main()

}//end class Fib