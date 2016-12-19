/**
 * Lab Three: Recursion No Loops
 * @author Victor Lourng and Dennis Uritsky
 * @version	2016
 */
import java.util.Scanner; 
 
public class LabThreeRecursionNoLoops {
  /**
   * Main gets user input
   */
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int numberUsed = keyboard.nextInt();
    AddDigits(numberUsed);
  }
  /**
   * Add Digits increments the steps and prints messages
   * @param	int digits
   * @return int
   */
  public static int AddDigits(int digits) {
    System.out.println("I am calculating...");
    digits = DisectDigits(digits);
    digits = DisectDigits(digits);
    digits = DisectDigits(digits);
    digits = DisectDigits(digits);
    System.out.println("This is easy!!! Your answer is " + digits + ".");
    return digits;
  }
    /**
   * Disect Digits takes the digits apart and adds them.
   * NOTE: LAB GRADER SAID THE INPUT HAS TO BE AN INTEGER!!!
   * @param	int digits
   * @return int
   */
  public static int DisectDigits(int digits) {
    int One =         (digits / 1) % 10;
    int Two =         (digits / 10) % 10;
    int Three =       (digits / 100) % 10;
    int Four =        (digits / 1000) % 10;
    int Five =        (digits / 10000) % 10;
    int Six =         (digits / 100000) % 10;
    int Seven =       (digits / 1000000) % 10;
    int Eight =       (digits / 10000000) % 10;
    int Nine =        (digits / 100000000) % 10;
    int Ten =         (digits / 1000000000) % 10;
    // ints can not be longer than 10 digits
    return One + Two + Three + Four + Five + Six + Seven + Eight + Nine + Ten;
  }
}

