/**
 * Hello World
 * @author Victor Lourng
 * @version	2016
 */
import java.util.Scanner; 
 
public class HelloWorldTwo {
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int numberUsed = keyboard.nextInt();
    AddDigits(numberUsed);
  }
  /**
   * AddDigits
   * @param	int x
   * @return boolean
   */
  public static int AddDigits(int digits) {
    System.out.println("I am calculating...");
    int step = 0;
    while (digits > 9) {
      step = step + 1;
      digits = DisectDigits(digits, step);
    }
    System.out.println("Finally Single digit in " + step + " steps !!!!!");
    System.out.println("Your answer is " + digits + ".");
    return digits;
  }
    /**
   * DisectDigits
   * @param	int x
   * @return boolean
   */
  public static int DisectDigits(int digits, int step) {
    int digitSum = 0;
    int digit = 0;
    System.out.print("Step " + step + ": ");
    while (digits >= 0) {
      int integerBase = (int)Math.log10(digits);
      int integerBaseone = (int)Math.pow(10, integerBase);
      if (integerBaseone != 0) {
        digit = digits / integerBaseone;
      } else {
        digit = 0;
      }
      digitSum = digitSum + digit;
      if ( digits > 9 ) {
        System.out.print(digit + " + ");
      }
      else {
        System.out.println(digit + " = " + digitSum + " ");
      }
      int numberOne = (int)Math.pow(10, digit);
      digits = digits % integerBaseone;
    }
    // int digit = digits % 10;
    // System.out.print(digit);
    // digits = digits / 10;
    // step = step + 1;
    return digitSum;
  }
}

