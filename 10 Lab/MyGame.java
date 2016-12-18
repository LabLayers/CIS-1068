import java.util.*;

/* Card guessing game, it deals a card from a shuffked deck and you have to
 * predict if the next card drawn is higher and lower. The score is based on
 * # of correct guesses you make. 
 */

public class MyGame {


   public static void main(String[] args) {
   

      Scanner kb = new Scanner(System.in);
      
      int gamesPlayed = 0;     
      int sumOfScores = 0;   
                             
      double averageScore;  
                      
      boolean playAgain;   
      String s;                    
      
      // Game loop
      do {
         int scoreThisGame;       
         // Plays game method then gets score
         scoreThisGame = play();  
         // Sum of scores from total games played
         sumOfScores += scoreThisGame;
         // Number of games played
         gamesPlayed++;
         // If game over then ask if user wants to play again.
         System.out.print("Play again? yes/no");
         s=kb.nextLine();
         playAgain = s.toUpperCase().equals("YES");
         // If not, break loop
      } while (playAgain);
      
      averageScore = ((double)sumOfScores) / gamesPlayed;
      
      System.out.println();
      System.out.println("You played " + gamesPlayed + " games.");
      System.out.printf("Your average score was %1.3f.\n", averageScore);
   
   }  

   private static int play() {
      
      // Create new deck, no jokers
      Deck deck = new Deck(); 

      Scanner kb = new Scanner(System.in);
      
      // Initlizes variables
      Card currentCard; 

      Card nextCard;  
      int correctGuesses;
      char guess;  

      // Shuffle deck
      deck.shuffle(); 

      // Sets score to zero
      correctGuesses = 0;
      // Deals card
      currentCard = deck.dealCard();
      // Prints dealed card
      System.out.println("The first card is the " + currentCard);
      
      // Runs while guesses are valid
      while (true) { 
         
         // Ask and validate user guess as input
         System.out.print("Will the next card be higher (H) or lower (L)?  ");
         do {
             guess = kb.nextLine().charAt(0);
             guess = Character.toUpperCase(guess);
             if (guess != 'H' && guess != 'L') 
                System.out.print("Please respond with H or L:  ");
         } while (guess != 'H' && guess != 'L');
         
         // Deals another card from the deck
         nextCard = deck.dealCard();
         // Prints dealed card
         System.out.println("The next card is " + nextCard);
         
         // If tie then breaks out of loop
         if (nextCard.getValue() == currentCard.getValue()) {
            System.out.println("The value is the same as the previous card.");
            System.out.println("You lose on ties.  Sorry!");
            break;  
         }
         // Goes prediction possibilities, if incorect then breaks out of loop
         else if (nextCard.getValue() > currentCard.getValue()) {
            if (guess == 'H') {
                System.out.println("Your prediction was correct.");
                correctGuesses++;
            }
            else {
                System.out.println("Your prediction was incorrect.");
                break;  
            }
         }
         else { 
            if (guess == 'L') {
                System.out.println("Your prediction was correct.");
                correctGuesses++;
            }
            else {
                System.out.println("Your prediction was incorrect.");
                break; 
            }
         }
         
      
         currentCard = nextCard;
         System.out.println();
         System.out.println("The card is " + currentCard);
         
      } 
      
      // Prints score
      System.out.println();
      System.out.println("The Game Ends.");
      System.out.println(correctGuesses 
                                           + " Correct Guesses.");
      System.out.println();
      
      // Return # of correct guesses
      return correctGuesses;
      
   } 
   

}
