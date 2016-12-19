import java.util.*;

/* Card guessing game, it deals a card from a shuffked deck and you have to
 * predict if the next card drawn is higher and lower. The score is based on
 * # of correct guesses you make. 
 */

public class War {


   public static void main(String[] args) {
   

      Scanner kb = new Scanner(System.in);
      
      int gamesPlayed = 0;     
      int totalturns = 0;
      
      boolean playAgain;   
      String s;                    
      
      // Game loop
      do {
         int scoreThisGame;       
         // Plays game method then gets score
         totalturns += play();
         gamesPlayed++;
         // If game over then ask if user wants to play again.
         System.out.print("Play again? yes/no ");
         s=kb.nextLine();
         playAgain = s.toUpperCase().equals("YES");
         // If not, break loop
      } while (playAgain);
      

      System.out.println();
      System.out.println("You played " + gamesPlayed + " games and " + totalturns + " total turns.");

   }  

   private static int play() {
      
      // Create new deck, no jokers
      Deck deck = new Deck(); 

      Scanner kb = new Scanner(System.in);
      
      // Initlizes variables
      Hand p1 = new Hand();
      Hand p2 = new Hand();
      
      // Shuffle deck
      deck.shuffle();
      
      // Split decks
      for (int i = 0; i < 26; i++){
         p1.addCard(deck.dealCard());
      }
      for (int i = 0; i < 26; i++){
         p2.addCard(deck.dealCard());
      }
               
      // Each turn
      int turn = 0;
      
      while(p1.getCardCount() > 0 && p2.getCardCount() > 0) {

         // Draw card
         Card p1card = p1.getCard(0);
         Card p2card = p2.getCard(0);
         
         // Print card
         System.out.println("Player 1 drew: " + p1card.getCardValueString());
         System.out.println("Player 2 drew: " + p2card.getCardValueString());
            
         // Compare and action cards
         if (p2card.getValue() > p1card.getValue()) {
            System.out.println(p2card.getCardValueString() + " is moved to Player 1's hand.");
            p2.removeCard(p2card);
            p1.addCard(p2card);
         } else if (p1card.getValue() > p2card.getValue()) {
            System.out.println(p1card.getCardValueString() + " is moved to Player 2's hand.");
            p1.removeCard(p1card);
            p2.addCard(p1card);
         } else {
            int warcount = 0;
            boolean waractive = true;
            do {
               System.out.println("WAR!");
               
               // Draw n additional cards, n <= 4 based on card availability.
               int p1n = p1.getCardCount()-1;
               int p2n = p2.getCardCount()-1;
               int n = 0;
               
               if (p1n > 4 && p2n > 4) {
                  n = 4;
               } else if (p1n > p2n) {
                  n = p2n;
               } else if (p2n > p1n) {
                  n = p1n;
               } else {
                  n = p1n;
               }
               
               System.out.println("Each player drawns " + n + " additional cards.");

               Card p1warcard = p1.getCard(warcount+n);
               System.out.println("Player 1 drew as a war card: " + p1warcard.getCardValueString());
               
               Card p2warcard = p2.getCard(warcount+n);
               System.out.println("Player 2 drew as a war card: " + p2warcard.getCardValueString());


               // Compare and action cards
               if (p2warcard.getValue() > p1warcard.getValue()) {
                  System.out.println("Player 2 wins the war. " + (warcount+n+1) + " cards are moved to Player 2's hand.");
                  
                  for (int j = 0; j <= warcount+n; j++) {
                     Card moving = p1.getCard(0);
                     p1.removeCard(moving);
                     p2.addCard(moving);
                  }
                  waractive = false;
               } else if (p1warcard.getValue() > p2warcard.getValue()) {
                  System.out.println("Player 1 wins the war. " + (warcount+n+1) + " cards are moved to Player 1's hand");
                  
                  for (int j = 0; j <= warcount+n; j++) {
                     Card moving = p2.getCard(0);
                     p2.removeCard(moving);
                     p1.addCard(moving);
                  }
                  waractive = false;
               } else {
                  warcount += 4;
                  waractive = true;
               }
               
            } while (waractive == true);
         }
         
         // Print card values
         turn++;
         System.out.println("End of turn " + turn + ". Player 1 has " + p1.getCardCount() + " cards. Player 2 has " + p2.getCardCount() + " cards.");

      }

      if (p1.getCardCount() == 0) {
         System.out.println("Player 2 wins!");
      } else if (p2.getCardCount() == 0) {
         System.out.println("Player 1 wins!");
      }
      return turn;
   } 
  


}
