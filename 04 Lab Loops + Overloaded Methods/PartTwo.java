/**
 * Lab 4 Part 2
 * @author Victor Lourng and Dennis Uritsky
 * @version	2016
 */
import java.util.Scanner;

public class PartTwo {
  
  /**
   * Ask user if they want to draw a square or rectangle, and get required paramaters.
   */
  public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);
    String input = "";
    
    while (!(input.contains("square") || input.contains("rectangle"))) {
      System.out.println("Do you want to print a 'square' or 'rectangle'?");
      input = keyboard.next();
      if (input.contains("square")) {
        int l;
        System.out.println("What is the length of your square?");
        l = keyboard.nextInt();
        drawSquare(l);
      }
      else if (input.contains("rectangle")) {
        int l, h;
        System.out.println("What is the length of your rectangle?");
        l = keyboard.nextInt();
        System.out.println("What is the height of your rectangle?");
        h = keyboard.nextInt();
        drawRectangle(l,h);
      }
      else {
        System.out.println("You did not enter a valid shape, try again! ;)");
      }
    }

  }
  
  /**
   * Draws a square based on user input
   * @param	int l for length
   */
  public static void drawSquare (int l) {
    for (int i = l; i>0; i--) {
      if (i == l || i == 1) {
        for (int x = l; x>0; x--) {
          System.out.print("*");
        }
        System.out.println();
      }
      else {
        for (int x = l; x>0; x--) {
          if (x == l || x == 1) {
            System.out.print("*");
          }
          else {
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    }
  }
  
  /**
   * Draws a rectangle based on user input
   * @param	int l for length
   * @param int h for height
   */
  public static void drawRectangle (int l, int h) {
    for (int i = h; i>0; i--) {
      if (i == h || i == 1) {
        for (int x = l; x>0; x--) {
          System.out.print("*");
        }
        System.out.println();
      }
      else {
        for (int x = l; x>0; x--) {
          if (x == l || x == 1) {
            System.out.print("*");
          }
          else {
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    }
  }

  
}