/**
 * Lab 5 Part 1 - String Parse
 * @author Victor Lourng and Angela Wieber
 * @version	2016
 */
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class StringParse {

  /**
   * Calls the methods in the program continuously
   */
  public static void main(String[] args) {
    while (true) {
      String input = AskForInput();
      ParseString(input);
    }
  }
  
  /**
   * Asks the user for a string input. If input is q, kills the program.
   */
  public static String AskForInput() {
    Scanner kbd = new Scanner(System.in);
    System.out.print("Enter any string (type 'q' to quit): ");
    String input = kbd.nextLine();
    if (!input.equals("q")) {
      return input;
    } else {
      System.out.println("You've quit the program.");
      System.exit(1); // Kill the program with exit code 1
      return "";
    }
  }
  
  /**
   * Parses a given string and prints the numbers of letters/digits/whitespace/special characters.
   * @param	String input
   */
  public static void ParseString(String input) {
    char[] inputArray = input.toCharArray();
    int letters = 0;
    int digits = 0;
    int whitespace = 0;
    int characters = 0;
    for (char c : inputArray) {
      if (Character.isWhitespace(c)) {
        whitespace++;
      }
      else if (Character.isLetter(c)) {
        letters++;
      }
      else if (Character.isDigit(c)) {
        digits++;
      } else {
        characters++;
      }
    }
    System.out.println("         Number of letters: " + letters);
    System.out.println("         Number of digits: " + digits);
    System.out.println("         Number of whitespace: " + whitespace);
    System.out.println("         Number of special characters: " + characters);
  }
  
}