/**
 * Lab 5 Part 2 - CharToIntArray
 * @author Victor Lourng and Angela Wieber
 * @version	2016
 */
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class CharToIntArray {

  /**
   * Calls the methods in the program.
   */
  public static void main(String[] args) {
      String input = AskForInput();
      int[] intArray = StringToCharToInt(input);
      LargestInteger(intArray);
  }
  
  /**
   * Asks the user for a non-empty string input.
   */
  public static String AskForInput() {
    Scanner kbd = new Scanner(System.in);
    String input;
    do {
      System.out.print("Enter any NON-EMPTY string: ");
      input = kbd.nextLine();
    } while (input.equals(""));
    return input;
  }
  
  /**
   * Parses a given string into a char array then into an int array, and prints the int array.
   * @param	String input
   */
  public static int[] StringToCharToInt(String input) {
    char[] inputArray = input.toCharArray();
    int[] intArray = new int[input.length()];
    for (int idx = 0; idx < intArray.length; idx++) {
      intArray[idx] = (int)inputArray[idx];
    }
    System.out.print("Input string in INT array form: ");
    printArray(intArray);
    return intArray;
  }
  
  /**
   * Prints a given int array.
   * @param	int[] ray
   */
  public static void printArray(int[] ray) {
    System.out.print("[" + ray[0]);
    for (int idx = 1; idx < ray.length; idx++) {
      System.out.print(", "+ray[idx]);
    }
    System.out.println("]");
  }
  
  /**
   * Finds the largest integer in a given int array, then prints the largest int and the char value of the largest int.
   * @param	int[] intArray
   */
  public static void LargestInteger(int[] intArray) {
    int largestInt = 0;
    for (int integer : intArray) {
      if (integer > largestInt) {
        largestInt = integer;
      }
    }

    System.out.println("The largest integer is: " + largestInt);
    System.out.println("The char value of " + largestInt + " is: " + (char)largestInt);
  }
}