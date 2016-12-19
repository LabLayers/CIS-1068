
public class Deck {

    private Card[] deck;
    // How many cards already used
    private int cardsDealt;

    
   // incomplete
    public Deck(boolean includeJokers) {
        // make cardsDealt = 0;
        cardsDealt = 0;
        if (includeJokers) {
           // create 54 new Cards 2 Jokers  >>    deck = new Card[54];
            deck = new Card[54];
            int counter = 0;
            // suit
            for (int i = 0; i <= 3; i++) {
                // value
                for (int j = 1; j <= 13; j++) {
                    deck[counter] = new Card(j,i);
                    counter++;
                }
            } 
             // 2 Jokers
            for (int i = 52; i < 54; i++) {
                // Card is joker by default
                deck[i] = new Card();
            }
        }
        else {
            // create 52 new Cards 
            deck = Create52();
        }

    }

    public Deck() {
        // make cardsDealt = 0;
        cardsDealt = 0;
        // create 52 new Cards 
        deck = Create52();
    }
    
    // create 52 new Cards 
    public Card[] Create52() {
        deck = new Card[52];
        int counter = 0;
        // suit
        for (int i = 0; i <= 3; i++) {
            // value
            for (int j = 1; j <= 13; j++) {
                deck[counter] = new Card(j,i);
                counter++;
            }
        }

        return deck;
    }

    public void shuffle() {

       // This is an interesting shuffling technique
        for ( int i = deck.length-1; i > 0; i-- ) {
            int rand = (int)(Math.random()*(i+1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
        cardsDealt = 0;
    }
   
    // return how many cards are left in deck // incomplete
    public int cardsLeft() {
       return deck.length;
    }

    //return a card from the top of deck // incomplete
    public Card dealCard() {
        // check if deck is not empty, modify card used, return a card from the top of deck
        if (deck.length > 0 && cardsDealt <= deck.length) {
            this.cardsDealt++;
            return deck[deck.length-cardsDealt];
        }
        else {
            throw new NullPointerException("Can't deal from an empty hand.");
        }
    }

    public boolean hasJokers() {
        return (deck.length == 54);
    }

} 
