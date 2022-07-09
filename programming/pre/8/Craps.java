import java.io.*;
import java.util.*;

public class Craps {
  
  
public static int roll(int n){
  Random random = new Random();
  int this_roll = random.nextInt(n)+1;
  System.out.println("A di was rolled and the number displayed is:");
  System.out.println(this_roll);
  return this_roll;
  
}

  public static int shoot(int num_of_dice, int max_di_value){
  int shoot_result = 0;
  int the_Point = 0;
    if(num_of_dice == 2){
    shoot_result = roll(max_di_value) + roll(max_di_value);
    } else {
    System.out.println("You can only play craps with two 6-sided dice, try again...");
    }

  if(shoot_result == 2 || shoot_result == 3 || shoot_result == 12){
  System.out.println("You shot... ");
  System.out.println(shoot_result);
  System.out.println(" ...that's craps and you lost. next please.");
  } else if (shoot_result == 7 || shoot_result == 11){
    System.out.println("You shot... ");
    System.out.print(shoot_result);
    System.out.println("...that's a natural and you won!!! *****UNLESS you shot a 7 after a previous Point value was established, in which case you just LOST*****");
  } else {
    System.out.println("You shot... ");
    System.out.print(shoot_result);
    System.out.println("...that's not craps or a natural, thats the Point...");
System.out.println("if you roll the Point again, you win...if you roll a 7, you lose...");
  round();
  }
  return shoot_result;
  
  
  
      
}

public static int round(){
    
//System.out.println("You shot a Point value, if you shoot the same point value again, you win, but it you shoot a 7 from this point forward, you lose");

shoot(2,6);
return 1;
}
  
public static void main(String[] args) {

//roll(6);
shoot(2, 6);
  
    
}
  
}