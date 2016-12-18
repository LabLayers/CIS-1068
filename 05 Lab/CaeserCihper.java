/**
 * Lab 5 Part 3 - Caeser Cihper
 * @author Victor Lourng and Angela Wieber
 * @version	2016
 */
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class CaeserCihper {

  /**
   * Calls the methods in the program.
   */
  public static void main(String[] args) {
      String stringInput = AskForString();
      int intInput = AskForInteger();
      GetEncrypedString(stringInput, intInput);
  }
  
  /**
   * Asks the user for a non-empty string input.
   */
  public static String AskForString() {
    Scanner kbd = new Scanner(System.in);
    String input;
    boolean isValidInput;
    do {
      System.out.print("Enter a string (only letters and whitespace): ");
      input = kbd.nextLine();
      char[] inputArray = input.toCharArray();
      int letters = 0;
      int digits = 0;
      int whitespace = 0;
      int characters = 0;
      isValidInput = true;
      for (char c : inputArray) {
        if (!(Character.isWhitespace(c) || Character.isLetter(c))) {
          isValidInput = false;
        }
        else {  }
      }
      if (input == "") {
        isValidInput = false;
      }
    } while (isValidInput == false);
    return input;
  }
  
  /**
   * Asks the user for a non-zero integer input.
   */
  public static int AskForInteger() {
    Scanner kbd = new Scanner(System.in);
    int input;
    do {
      System.out.print("Enter any NON-ZERO integer: ");
      input = kbd.nextInt();
    } while (input == 0);
    return input;
  }
  
  /**
   * Parses a given string into a char array into an interger array. Then runs a cypher and prints the output.
   * @param	String StringInput
   * @param	int cipher
   */
  public static void GetEncrypedString(String stringInput, int cipher) {
    char[] inputArray = stringInput.toCharArray();
    int[] intArray = new int[stringInput.length()];
    // Convert to int
    for (int idx = 0; idx < intArray.length; idx++) {
      intArray[idx] = (int)inputArray[idx];
    }
    // Apply cypher
    for (int idx = 0; idx < intArray.length; idx++) {
      if (intArray[idx] == 32) {
        // Leave spaces untouched
      } else if (intArray[idx] >= 65 && intArray[idx] <= 90) {
        // Uppercase loop
        intArray[idx] = intArray[idx] + cipher;
        if (intArray[idx] > 90) {
          intArray[idx] = intArray[idx] - 26;
        }
      }
      else if (intArray[idx] >= 97 && intArray[idx] <= 122) {
        // Lowercase loop
        intArray[idx] = intArray[idx] + cipher;
        if (intArray[idx] > 122) {
          intArray[idx] = intArray[idx] - 26;
        }
      }
      else {
        // Do nothing with edge cases
      }
    }
    System.out.print("Encrypted string: ");
    for (int x : intArray) {
      System.out.print((char)x);
    }
  }

}