import java.util.ArrayList;
//Greg Sciame Tue July 12, 2022
//coding along with Professor Konstantinovich during ArrayList intro
public class Test{
  public static void main(String[] args){
    ArrayList<String>words = new ArrayList<String>();
    ArrayList<Integer>numbers = new ArrayList<Integer>(15);

    //adding
    words.add("fish");
    words.add("fish2");
    words.add("fish3");
    words.add(1,"something else");

    System.out.println(words);
    System.out.println(words.get(0));
    words.set(0,"notFish");
    System.out.println(words);

    System.out.println(words.get(words.size()-1));

    
    
  }
}