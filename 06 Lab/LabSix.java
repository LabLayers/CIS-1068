/**
 * Lab 6
 * @author Victor Lourng
 * @version	2016
 */
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class LabSix {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    char[] alphabet = {'N','O','J','K','B','A','G','F','E','M','L','H','C','D','I','Z','Q','T','S','R','Y','U','V','W','X','P'};
    String[] words = new String[7];
    int[] priority = new int[7];
    // String[] wordsTemp = new String[7];
    // int[] priorityTemp = new int[7];
    // String[] wordsSorted = new String[7];
    // int[] prioritySorted = new int[7];
    String sort1,sort2;
    int character = 0;
    
    // Get User Input
    System.out.println("Input: Enter 7 words:");
    for (int i=0;i<7;i++) {
      words[i] = kbd.nextLine();
    }
    
    // Debug
    // printArray(words);
    // printArray(alphabet);
    
    // Get position of first letter each input word in alphabet array
    for(int i=0;i<7;i++) {
      priority[i] = new String(alphabet).indexOf( words[i].toUpperCase().substring(character,(character+1)) );
    }
    // printArray(priority);
    
    // Sort Array (I think this is bubble sort)
    int pos = 0;
    int tmp = 0;
    String ttmp = "";
    for (int j = 7; j >= 0; j--) {
      for (int i = 0; i < 7-1; i++) {
        pos = i + 1;
        // Compare values
        if (priority[i] > priority[pos]) {
          // Do the swag
          tmp = priority[i];
          priority[i] = priority[pos];
          priority[pos] = tmp;
          
          ttmp = words[i];
          words[i] = words[pos];
          words[pos] = ttmp;
        }
      }
      // Debug sorting
      // printArray(priority);
    }
    
    // Again to find duplicates
    pos = 0;
    tmp = 0;
    ttmp = "";
    boolean dupes = false;
    for (int j = 7; j >= 0; j--) {
      for (int i = 0; i < 7-1; i++) {
        pos = i + 1;
        // Compare values
        if (priority[i] > priority[pos]) {
          // Do the swag
          tmp = priority[i];
          priority[i] = priority[pos];
          priority[pos] = tmp;
          
          ttmp = words[i];
          words[i] = words[pos];
          words[pos] = ttmp;
        }
      }
      // Debug sorting
      // printArray(priority);
    }
    // Debug output
    // printArray(priority);
    // printArray(words);
    
    // Print output
    System.out.println("###################");
    for(int i=0;i<7;i++) {
      System.out.println(words[i]);
    }
  }

  /**
   * Prints a given int array.
   * @param	Object[] ray
   */
  public static void printArray(String[] ray) {
    System.out.print("[" + ray[0]);
    for (int idx = 1; idx < ray.length; idx++) {
      System.out.print(", "+ray[idx]);
    }
    System.out.println("]");
  }
  public static void printArray(char[] ray) {
    System.out.print("[" + ray[0]);
    for (int idx = 1; idx < ray.length; idx++) {
      System.out.print(", "+ray[idx]);
    }
    System.out.println("]");
  }
  public static void printArray(int[] ray) {
    System.out.print("[" + ray[0]);
    for (int idx = 1; idx < ray.length; idx++) {
      System.out.print(", "+ray[idx]);
    }
    System.out.println("]");
  }
}