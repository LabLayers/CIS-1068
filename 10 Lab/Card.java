public class Card {
   
   public final static int SPADES = 0;   //  4 suits and Joker.
   public final static int HEARTS = 1;
   public final static int DIAMONDS = 2;
   public final static int CLUBS = 3;
   public final static int JOKER = 4;
   
   public final static int ACE = 1;      // Special Cards
   public final static int JACK = 11;   
   public final static int QUEEN = 12;   
   public final static int KING = 13;
   
 
   private final int suit; //The suit cannot be changed
   
   private final int value; // 1 through 13, with 1 representing ACE
   

   // incomplete
   public Card() {
      // make suit = JOKER and value = 1 by default;
      this.suit = JOKER;
      this.value = 1;
   }
   

   // example new Card(1,Card.JOKER)"
   public Card(int thisValue, int thisSuit) {
      // check thisSuit is either SPADES, HEARTS, DIAMONDS, CLUBS or JOKER 
      // check 0 < thisValue < 14
      // make value = thisValue; suit = thisSuit;
      if (thisSuit == SPADES || thisSuit == HEARTS || thisSuit == DIAMONDS || thisSuit == CLUBS || thisSuit == JOKER) {
         if (thisValue > 0 && thisValue < 14) {
            this.value = thisValue;
            this.suit = thisSuit;
         }
         else {
            throw new IllegalArgumentException("Invalid card value entered: " + thisValue);
         }
      }
      else {
         throw new IllegalArgumentException("Invalid card suit entered: " + thisSuit);
      }
   }

   
   // getters // incomplete
   public int getSuit() {
      return this.suit;
   } 
   // incomplete 
   public int getValue() {
      return this.value;
   }
   
    // in case we need strings
   public String getCardSuitString() {
      switch ( suit ) {
      case SPADES:   return "Spades";
      case HEARTS:   return "Hearts";
      case DIAMONDS: return "Diamonds";
      case CLUBS:    return "Clubs";
      default:       return "Joker";
      }
   }
   
  
   // IN CASE WE NEED strings
   public String getCardValueString() {
      if (suit == JOKER)
         return "" + value;
      else {
         switch ( value ) {
         case 1:   return "Ace";
         case 2:   return "2";
         case 3:   return "3";
         case 4:   return "4";
         case 5:   return "5";
         case 6:   return "6";
         case 7:   return "7";
         case 8:   return "8";
         case 9:   return "9";
         case 10:  return "10";
         case 11:  return "Jack";
         case 12:  return "Queen";
         default:  return "King";
         }
      }
   }
   

   public String toString() {
      if (suit == JOKER) {
         if (value == 1)
            return "Joker";
         else
            return "Joker #" + value;
      }
      else
         return getCardValueString() + " of " + getCardSuitString();
   }
   

} // end class Card
