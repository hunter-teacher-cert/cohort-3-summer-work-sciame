import java.io.*;
import java.util.*;
import java.lang.Math;
/*
group project by: Greg Sciame, Alana Robinson, Maxwell Yearwood, Jessica Novillo Argudo, & Sam Lojacono
*/


public class Nim 
{
    public static void main(String[] args) {
      int stones = 12;
      int stonesTaken;
      String player = "user";

      Scanner input = new Scanner(System.in);
      //loop until game ends
      while(stones > 0){
        if(player == "user"){
          // prompt user for input (user turn)
        System.out.println("How many stones would you like to remove from the bag? (1, 2, or 3)\n");
        stonesTaken = input.nextInt();
player = "user";
        //calculate the number of stones remaining, print
        stones = stones - stonesTaken;
        System.out.println("There are now " 
                           + stones  
                           + " stones remaining.\n");
          if(stones < 1){
            break;
          }
          player = "computer";
        } else if(player == "computer"){
          //check for win
          
        stonesTaken = ((int)(Math.random()*3)+1);
          
System.out.println("Now the computer selects " 
                   + stonesTaken +"\n");
        //machine turn
stones = stones - stonesTaken;
          System.out.println("There are now " 
                           + stones  
                           + " stones remaining.\n");
        //check win
          if(stones < 1){
            break;
          }
          player = "user";
        }
      }
      System.out.println("You win, " + player);
    }
}