import java.util.Scanner;

public class RecursionLab{
  
  public static void main(String[] args){
    
    Scanner number = new Scanner(System.in);
    
    int integerOne;
    
    System.out.println("Enter any integer: ");
    integerOne = number.nextInt();
    repeating(integerOne);
  }
    
    public static int repeating(int integerOne){
      
      while (integerOne >= 10) {
        int integerBase;
        int integerBaseone;
        integerBase = (int)Math.log10(integerOne);
        integerBaseone = (int)Math.pow(10, integerBase);
        int placeHolder = integerOne / integerBaseone;
        System.out.println(placeHolder);
        answers(placeHolder, integerOne);
        return placeHolder;
      }
      return integerOne;
    }
    
    public static void answers(int placeHolder, int integerOne) {
      int numberOne;
      numberOne = (int)Math.pow(10, placeHolder);
      int numberPower;
      numberPower = integerOne-numberOne;
      repeating(numberPower);
    }                              
}