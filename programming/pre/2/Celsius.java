import java.io.*;
import java.util.*;

class Celsius {
  public static void main(String[] args){

  final double F_TO_C_FACTOR = 1.8;
  double tempC;
  double tempF;
  
  Scanner inpu = new Scanner(System.in);

  System.out.print("Enter the temperature in degrees Celsius...");
  tempC = in.nextDouble();
       

  tempF = tempC * F_TO_C_FACTOR + 32;

  System.out.printf("%.2f C = %.2f F\n",tempC, tempF);

}


}