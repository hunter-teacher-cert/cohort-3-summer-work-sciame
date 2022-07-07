import java.io.*;
import java.util.*;

//I was coding this as Dr. Sakas was explaining the slides of this...
class Grade{
    public static void main(String[] args){}
  
  private String ID;
  private double score;
  private double weight;

  public void setID(String id){
    ID = id;
  }

  public String getID(){
    return ID;
  }
  
  public Grade(){
    ID = "";
    score = 0.0;
    weight = 0.0;
  }
  public Grade(String id, double s, double w){
    ID = id;
    score = s;
    weight = w;
  }
  
  public void enterInfo(){
    Scanner input = new Scanner(System.in);
    ID = input.nextLine();
    score = input.nextDouble();
    input.nextLine();
    weight = input.nextDouble();
    input.nextLine();
  }

    public void showInfo(){
      System.out.println("ID: " + ID + "\nScore: "+ score + "\nWeight: " + weight);
    } 

}