import java.io.*;
import java.util.*;


/**
 * Driver class for Time class  by Breakout room #7 on July 7th, 2022
 * Greg Sciame
 * collaborators: Christine Marra, Joshua Higgins, Dave Ciolino Volano
 */

/**
   INSTRUCTIONS:
   This file contains the Driver starter code for our Time class.
   
   Add code in main to test all your methods
   
   Place this file in a folder named programming/5/Driver.java
*/


public class Driver {

    public static void main(String[] args) {

	//declare a var of appropriate type to assign an instance of Time to
	Time t;
  Time t2;

	//assign var the address of a newly-apportioned Time object
	t = new Time(10, 30, 15);
  t2 = new Time(9,40,15)
  System.out.println(t.toString());
  System.out.println(t);
  String temp = t + "!";
  System.out.println(temp);

  //t.toString();
  //t2.toString();
  
    }//end main()

}//end class