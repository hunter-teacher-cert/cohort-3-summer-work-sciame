/**
 * Recursion Practice with Strings by Team SweatEquity
 * First Last
 * collaborators: First Last, First Last
 */

public class Fence
{

  /**
     String fenceR(int) -- recursive fence generator
     precond:  input is a positive integer
     postcond: returns fence with n posts
     eg
     fenceR(1) -> "|"
     fenceR(2) -> "|--|"
  */
  public static String fenceR( int n )
  {
    /* YOUR SIMPLE, SMART IMPLEMENTATION HERE */
    //I typed this up as I was following along with Stacy Golstein's presentation of their group's solution, since I hadn't gotten to this yet
    if(n==0){
      return " ";
    } else if(n==1){ //I added 'else if' instead of a new 'if'...seems to work the same and feels more like one complete statement
      return "|";
    } else {
      return fenceR(n-1) + "--|";
    }
  }


  public static void main( String[] args )
  {

    for( int i = 0; i < 10; i++ ) {
      //I edited the string concatenation to be "Fence with i posts" instead of "post fences "
      System.out.println("Fence with " +i + " posts...");
      System.out.println( fenceR(i) );
    }

    /* feel free to add extra tests... */

  }
}
