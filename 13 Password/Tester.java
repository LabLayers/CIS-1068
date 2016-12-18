import java.util.Scanner; 
import java.util.Random; 

public class Tester {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Welcome to the magical password grid generator!");
    System.out.println("What is the desired length of your password?");
    int pwdlength = s.nextInt();
    while(pwdlength < 10 || pwdlength > 100) {
      if(pwdlength < 10) {
        System.out.println("That's a little short for a password. Pick something longer.");
      } else if (pwdlength > 100) {
        System.out.println("You're going to have a bit of trouble typing in a long password. Pick something shorter.");
      } else {
        System.out.println("Please enter a valid integer betweeen 10 and 100:");
      }
      pwdlength = s.nextInt();
    }
    System.out.println("How many rows do you want? Pick a # between 8 and 24:");
    int pwdheight = s.nextInt();
    while(pwdheight < 8 || pwdheight > 24) {
      System.out.println("Please enter a valid integer betweeen 8 and 24:");
      pwdheight = s.nextInt();
    }
    System.out.println("Pick a random number between 0 and 20: (This will randomize the generator!)");
    int pwdsalt = s.nextInt();
    while(pwdsalt < 0 || pwdsalt > 20) {
      System.out.println("Please enter a valid integer betweeen 0 and 20:");
      pwdsalt = s.nextInt();
    }
    PasswordGrid myGrid = new PasswordGrid(pwdlength, pwdheight, pwdsalt);
    System.out.println("Behold, here is your grid! Keep it in a safe place:");
    System.out.println(myGrid.toString());
    System.out.println("A file has been saved to output.txt.");
    System.out.println(myGrid.writeFile());

  }

}