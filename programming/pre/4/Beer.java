import java.io.*;
import java.util.*;

class Beer {


public static void countdown(int n) {
    
    if (Math.abs(n) == 0) {
        System.out.println("No bottles of beer on the wall,\nno bottles of beer,\nya’ can’t take one down, ya’ can’t pass it around,\n’cause there are no more bottles of beer on the wall!\n");
    } else {
        System.out.println(n + " bottles of beer on the wall,\n"+ n + " bottles of beer,\nya' take one down, ya' pass it around,\n"+(n-1)+" bottles of beer on the wall.\n");
        countdown(Math.abs(n) - 1);
    }
}


public static void main(String[] args) {
    countdown(99);
}


}