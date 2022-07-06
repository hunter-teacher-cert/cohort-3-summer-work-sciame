import java.io.*;
import java.util.*;

/**
 * Array2DPractice by Breakout Room 4 July 5th, 2022
 * Greg Sciame
 * collaborators: Marieke Thomas, Ben Eckley
 */

/**
   INSTRUCTIONS:
   Place this file in a folder named programming/3/.
   This file contains the following completed method. Use it as a model
   to help you with the other methods:
   - buildBoard
   This file also contains stubs (empty methods) for the following
   methods (split into 3 levels):
   Basic level (complete all):
   - printBoard *
   - copyBoard *
   Intermediate level (complete Basic methods plus this method):
   - explodeSquare *
   Advanced level (complete Basic + Intermediate + these two methods):
   - explodeAllChar *
   - downString
   The routines with the * will be particularly helpful for the
   Conway's Game of Life project that you'll work on after this one.
*/


/**
   creates and returns a 2D array of size rowsxcols chars. All elements
   in the 2D array will be set to the char value.
   Ex: buildBoard(3,4,'x') will return this 2D array:
   xxxx
   xxxx
   xxxx
   
   Use this completed method as an example to help you with some of the
   other methods.
*/

public class Array2DPractice
{
  public static char[][] buildBoard( int rows, int cols, char value )
  {
    char[][] board = new char[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        board[i][j]=value;
      }
    }
    return board;
  }

  /**
     pretty prints a 2D array of characters
     This should print the array as a grid
  */
/*
public static void printArray( int[] data ){
  
System.out.print("{" + data[0]);
    for (int i = 1; i < data.length; i++) {
        System.out.print(", " + data[i]);
    }
    System.out.print("}");
  System.out.println("");

  }
*/
  public static void printBoard( char[][] board )
  {
    /* YOUR AWESOME CODE HERE */
//our group used 'i' and 'w' (because i and j are too similar), but I changed mine to use 'row' & 'col' because Ed Hawkin's group did that, and it seems to help clear up confusion.  
    for (int row = 0; row < board.length; row++) {
      for(int col = 0; col < board[row].length; col++){
        //I concatenated a space here because I liked how it was less congested when Ed Hawkins was demo-ing
        System.out.print(board[row][col] + " ");
        
      }
        System.out.println("");
    }

  System.out.println("");

  }

  /**
     Parameters:
     board - a 2D array of char
     row - the row you want to set
     value - the value to set all the elements in row
     Returns:
     Nothing
     Change the 2D array board so that all the elements in the
     specified row are set to value.
     Ex: Given array:
     xxxx
     xxxx
     xxxx
     xxxx
     setRow(board,2,'@') will change board to
     xxxx
     xxxx
     @@@@
     xxxx
  */
  public static void setRow( char[][] board, int row, char value )
  {
    /* YOUR AWESOME CODE HERE */
  }


  /**
     creates and returns a new 2D array of char the same size as
     original and copies all the elements
I followed along with Marieke as she was demo-ing (she is in my group and solved this by herself during groups because she didn't want to rush as me and Ben figured out the earlier problems...with her help...she did a good job of asking questions to get us to find the solutions together)
  */
  public static char[][] copyBoard( char[][] original )
  {
    char[][] copy = new char[original.length][original[0].length];
    for(int row = 0; row < original.length; row++) {
      for(int col = 0; col < original[0].length; col++){
        copy[row][col] = original[row][col];
      }
    }
    /* YOUR AWESOME CODE HERE */
    return copy;
  } 


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board
     Returns:
     nothing
     A location in a 2D array can be thought of as having 8
     neighbors.  In the below 2D array, the neighbors of the element
     marked Q are the numbered elements.
     oooooo
     o123oo
     o4Q5oo pptpower*     
     o678oo
     oooooo
     This method should change all the neighbor cells (elements) to an X
     but not change the element at row,col
     Ex:
     Given the 2D array
     QQQQQ
     QQQQQ
     QQQQQ
     QQQQQ
     explodeSquare(board,1,1) will change the array to
     XXXQQ
     XQXQQ
     XXXQQ
     QQQQQ
     Note: Make sure to correctly handle the cases when you try
     to explode an element on the edges.
  */
  public static void explodeSquare( char[][] board, int row, int col )
  {
    /* YOUR AWESOME CODE HERE */
    for(int i = row-1; i <= row + 1; i++){
      for(int w = col-1; w <= col +1; w++){
        //System.out.print(board[i][w]);
        if(i >= 0 && w >= 0 && i < board.length && w < board[0].length){
          board[i][w]='X';
          
      } else if(i==row && w==col){
          continue;
      }
    }
  }
  }
  /**
     This method will search through the 2D array board and it will
     explode each square that contains the char c (using the above
     definition of exploding).
     Example:
     Given the array
     qXzXq
     qXXXq
     qqqqq
     XXXqq
     XzXqq
     XXXXX
     qqqXz
     explodeAllchar(board,'z') will change board to:
  */
  public static void explodeAllChar(char[][] board, char c)
  {
    //July 6, 2022
    //I got this code from Joshua Higgins...he was explaining how it works to our new group and in the sake of moving on, I copied it so I could have a a working algorithm to apply to the Game of Life problem...
    boolean[][] willExplode = new boolean[board.length][board[0].length];
    for(int i = 0; i < board.length; i++){
      Array.fill(willExplode[i], false);
    }
    
    for(int i = 0; i < board.length; i++){
      for(int j = 0; j < board[i].length; j++){
        if(board[i][j] == c){
           willExplode[i][j] = true;
        }
      }
    }

    for(int i = 0; i < board.length; i++){
      for(int j = 0; j < board[i].length; j++){
        if(willExplode[i][j]){
          explodeSquare(board,i,j);
        }
      }
    }
    /* YOUR AWESOME CODE HERE */ 
  }


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board
     word - a String that you want to insert into the board.
     This will insert the parameter word into board in the downward
     direction. See examples below
     Example:
     Given this array
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     downString(board,1,1,"Hello") will change board to:
     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxxxx
     xOxxxx
     xxxxxx
     Given the above array, downString(board,4,3,"World") will
     change board to:
     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxWxx
     xOxOxx
     xxxRxx
     Note that the method has to stop at the bottom of the array.
  */
  public static void downString( char[][] board, int row, int col, String word )
  {
    /* YOUR AWESOME CODE HERE */
  }


  public static void main( String[] args )
  {
    char[][] b = buildBoard(5,10,'z');
    //b[1][1]='a';
    //b[1][2]='b';
    //b[0][1]='c';
    //b[2][3]='d';

    printBoard(b);
    char [][] c = copyBoard(b);
    printBoard(c);
    explodeSquare(b, 1, 2);
    printBoard(b);
    
   
    /*
      Note, you can directly set elements in the board
      using array notation like b[3][2]='z' and you
      can use array notation to also access individual
      elements
    */
  }
}

/*
Footer
© 2022 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About
You have no unread notifications
  */