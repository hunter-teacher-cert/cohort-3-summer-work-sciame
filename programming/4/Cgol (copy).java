import java.io.*;
import java.util.*;
import java.lang.Math;

/**
***IF YOU TEST THIS OUT, YOU HAVE TO PRESS ENTER 20 TIMES TO COMPLETE THE SIMULATION***
 * Conway's Game of Life by Breakout Room #7: July 6th, 2022
 * Greg Sciame
 * collaborators: Joshua Higgins, Christine Marra, Dave Ciolino-Volano
 */

/**
   The Rules of Life:
   Survivals:
   * A living cell with 2 or 3 living neighbours will survive for the next generation.
   Deaths:
   * Each cell with >3 neighbours will die from overpopulation.
   * Every cell with <2 neighbours will die from isolation.
   Births:
   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.
   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation.
*/

public class Cgol
{
public static final Scanner in = new Scanner(System.in);//see line 155, or look for: in.nextLine() in the main()...that's what goes with this waiting for the user to press 'enter'...
  //create, initialize, and return  empty board (all cells dead)
  public static char[][] createNewBoard( int rows, int cols )
  {
 char[][] board = new char[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        board[i][j]=' ';
      }
    }
    return board;
  }


  //print the board to the terminal
  public static void printBoard( char[][] board )
  {
    for(int j = 0; j < board[0].length + 2; j++
   ){
  System.out.print('-');
    }
    System.out.println();
    
  for(int i = 0; i < board.length; i++){
    System.out.print('|');
    for(int j = 0; j < board[i].length; j++){
    System.out.print(board[i][j]);
    }
    
    System.out.println('|');
  }
    for(int j = 0; j < board[0].length + 2; j++){
    System.out.print('-');
    }
        System.out.println();
  }


  //set cell (r,c) to val
  public static void setCell( char[][] board, int r, int c, char val )
  {
    board[r][c] = val;
  }


  //return number of living neigbours of board[r][c]
  public static int countNeighbours( char[][] board, int r, int c )
  {
    //since I'm a little behind on the assignments, I typed out Alise B's group's code for this as she was explaining it...and I modified it to fit with my group's existing array[][] ...our 'dead' cells are ' ' instead of '-' like Alise's group
    int row = board.length;
    int col = board[0].length;
    int count = 0;
    for(int i = Math.max(0, r-1); i < row && i <= r + 1; i++){
      for(int j = Math.max(0, c-1); j < col && j <= c + 1; j++){
        if(!(i == r && j == c)){
          //System.out.println("Row: " + i + ", column: " + j);
          if(board[i][j] != ' '){
            count ++;
          }
        }
      }
    }
    return count;
  }

/*
This is the one Joshua Higgins made from our group...I put it here to compare to Alise's group (the one I typed as she was presenting to the class)
  //return number of living neigbours of board[r][c]
  public static int countNeighbours( char[][] board, int r, int c )
  {
    int num = 0;  // countNeighbors  X = alive space i= dead
    for(int i = r-1; i <= r+1; i++){
      for(int j = c-1; j <= c+1; j++){
        if((i >= 0 && i < board.length  // is i between 0 and length of Row array (hot off  the board Horz)
          && j >= 0 && j < board[0].length)  //make sure j is between 0 and length of Column
          && (i != r || j != c)){   // *look at squares around* make sure its not focused on center squre
            if(board[i][j] == 'X'){
              num++;
            }
        }
      }
    }
    return num;
  }
*/


  /**
     precond: given a board and a cell
     postcond: return next generation cell state based on CGOL rules
     (alive 'X', dead ' ')
  */
  public static char getNextGenCell( char[][] board,int r, int c )
  {
    char myCell = 'X';
    int numLiveNeighbours = countNeighbours(board, r, c);
    //System.out.println("Row: " + r + " Column: " + c + " NbrCount: "+ numLiveNeighbors);
    //in.nextLine();
    if(board[r][c] == 'X'){
      if(numLiveNeighbours < 2 || numLiveNeighbours > 3){
        myCell = ' ';
      }
    } else if(board[r][c] == ' '){
      if(numLiveNeighbours != 3){
        myCell = ' ';
      }
    }
    return myCell;
  }


  //generate and return a new board representing next generation
  public static char[][] generateNextBoard( char[][] board )
  {
    char[][] nextBoard = new char[board.length][board[0].length];

    for(int i = 0; i < board.length; i++){
      for(int j = 0; j < board[i].length; j++){
        setCell(nextBoard, i, j, getNextGenCell(board,i,j));
      }
    }
    return nextBoard;
  }


  public static void main( String[] args )
  {
      
    char[][] board;
    board = createNewBoard(25,25);
    //printBoard(board);
    //breathe life into some cells:
    setCell(board, 0, 0, 'X');
    setCell(board, 3, 15, 'X');
    setCell(board, 3, 14, 'X');
    setCell(board, 2, 13, 'X');
    setCell(board, 2, 14, 'X');
    setCell(board, 1, 14, 'X');
    setCell(board, 10, 5, 'X');
    setCell(board, 5, 10, 'X');
    setCell(board, 10, 0, 'X');
    setCell(board, 13, 15, 'X');
    setCell(board, 13, 14, 'X');
    setCell(board, 12, 13, 'X');
    setCell(board, 12, 14, 'X');
    setCell(board, 11, 14, 'X');
    setCell(board, 20, 5, 'X');
    setCell(board, 15, 10, 'X');
//below is a loop that will run 20 generations for testing
    for(int i = 0; i < 21; i++){
      System.out.println("Generation " + i);
      printBoard(board);
      in.nextLine(); //it won't continue the program until the user presses the 'enter' key   (see the very top of the Cgol class definition to see what line of code is necessary for this line to work)
      board = generateNextBoard(board);
    }
    
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // TASK:
    // Once your initial version is running,
    // try out different starting configurations of living cells...
    // (Feel free to comment out the above three lines.)
    System.out.println("Gen X:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    board = generateNextBoard(board);
    System.out.println("Gen X+1:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class







