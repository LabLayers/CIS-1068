import java.util.Scanner; 
import java.util.Random; 

public class PasswordHelper {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Welcome to the magical password grid generator!");
    System.out.println("What is the desired length of your password?");
    int pwdlength = s.nextInt();
    System.out.println("How many rows do you want? Pick a # between 8 and 24:");
    int pwdheight = s.nextInt();
    while(pwdheight < 8 ||pwdheight > 24) {
      System.out.println("Please enter a valid integer betweeen 8 and 24:");
      pwdheight = s.nextInt();
    }
    System.out.println("Pick a random number between 0 and 20:");
    int pwdsalt = s.nextInt();
    while(pwdsalt < 0 || pwdsalt > 20) {
      System.out.println("Please enter a valid integer betweeen 0 and 20:");
      pwdsalt = s.nextInt();
    }

    System.out.println("Behold, here is your grid! Keep it in a safe place:");
    int [][] fire = new int[pwdheight][pwdlength];
    char [][] tree = new char[pwdheight][pwdlength];
    for(int i = 0; i< fire.length; i++){
      for (int j = 0; j < fire[i].length; j++){
        fire[i][j] = (int)(Math.random() * 94) + 14 + pwdsalt;
        tree[i][j] = (char)fire[i][j];
      }
      // printArray(fire[i]);
      printArray(tree[i]);
    }

  }
  
  
  public static void printArray(int[] ray) {
    System.out.print("{" + ray[0]);
    for (int idx = 1; idx < ray.length; idx++) {
      System.out.print(", "+ray[idx]);
    }
    System.out.println("}");
  }

  public static void printArray(char[] ray) {
    for (int idx = 0; idx < ray.length; idx++) {
      System.out.print(ray[idx]);
    }
    System.out.println();
  }

}