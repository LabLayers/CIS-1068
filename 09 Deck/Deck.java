import java.util.Arrays;
import java.util.Random;

/**
 * A deck of playing cards (of fixed size).
 */
public class Deck {

    private Card[] cards;
    private Random r;
    
    /**
     * Constructs a standard deck of 52 cards.
     */
    public Deck() {
        this.cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.cards[index] = new Card(rank, suit);
                index++;
            }
        }
    }

    /**
     * Constructs a deck of n cards (null).
     */
    public Deck(int n) {
        this.cards = new Card[n];
    }

    /**
     * Gets the internal cards array.
     */
    public Card[] getCards() {
        return this.cards;
    }

    /**
     * Displays each of the cards in the deck.
     */
    public void print() {
        for (int i = 0; i < this.cards.length; i++) {
            System.out.println(this.cards[i]);
        }
    }

    /**
     * Returns a string representation of the deck.
     */
    public String toString() {
        return Arrays.toString(this.cards);
    }

    /**
     * Chooses a random number between low and high, including both.
     */
    public int randomInt(int low, int high) {
        return r.nextInt(high - low + 1) + low;
    }
    /**
     * Swaps the cards at indexes i and j.
     */
    public void swapCards(int i, int j) {
        Card temp = cards[i];
        cards[i] = cards[j];
        cards[j] = temp;
    }

    /**
     * Randomly permutes the array of cards.
     */
    public void shuffle() {
     for (int i = 0; i < cards.length; i++) {
          swapCards(i, randomInt(1, cards.length));
        }
    }

    /**
     * Finds the index of the lowest card
     * between low and high inclusive.
     */
    public int indexLowest(int low, int high) {
        for (int i = 0; i < cards.length; i++) {
        }
        return 0;
    }

    /**
     * Sorts the cards (in place) using selection sort.
     */
    public void selectionSort() {
        for (int i = 0; i < cards.length; i++) {
            // default min is first value
            int min = i; // cards[i].getValue();  
            for (int j = i+1; j < cards.length; j++) {
                // if lowest
                if (cards[j].getValue() < cards[i].getValue()) {
                    min = j;
                }
            }
            if (min != i) {
                swapCards(i, min);
            }
        }
    }

    /**
     * Returns a subset of the cards in the deck.
     */
    public Deck subdeck(int low, int high) {
        Deck sub = new Deck(high - low + 1);
        for (int i = 0; i < sub.cards.length; i++) {
            sub.cards[i] = this.cards[low + i];
        }
        return sub;
    }

    /**
     * Combines two previously sorted subdecks.
     * -make a new deck big enough to hold both d1 and d2
        -create an index for each deck, like i and j, initially set to zero
        -for each spot in our merged deck:
          - if no cards in d1, use d2
          - if no cards in d2, use d1
          - else compare the top card from d1 with the top card from d2
          - add the lowest card to the new deck and increment i or j
        -return the new deck
     */
    public static Deck merge(Deck d1, Deck d2) {
        Deck d3 = new Deck(d1.length + d2.length);
        for (int i = 0; i < d1.length; i++) {
            for (int j = 0; j < d2.length; i++) {
                if (d1.length == 0) {
                    d3.cards[i+j] = d2.cards[i];
                } else if (d2.length == 0) {
                    d3.cards[i+j] = d1.cards[i];
                } else {
                    if (d1.cards[i].getValue() < d2.cards[i].getValue()) {
                        d3.cards[i+j] = d1.cards[i];
                    } else if (d2[i].getValue() < d1.crds[i].getValue()) {
                        d3.cards[i+j] = d2.cards[i];
                    } else {
                        d3.cards[i+j] = d1.cards[i];
                    }
                }
            }
        }
        return d3;
    }

    /**
     * Returns a sorted copy of the deck using merge sort.
     *  -Divide the deck into two subdecks
        -sort each deck with mergeSort
        -merge the two sorted decks together 
     */
     public Deck mergeSort() {
        int midpoint = (int)Math.floor(deck.length/2);
        Deck d1 = subdeck(0, midpoint);
        Deck d2 = subdeck(midpoint, deck.length);
        Deck sorted = mergeSort(d1, d2);
        return sorted;
     }
    public Deck mergeSort(Deck d1, Deck d2) {
        int midpoint = (int)Math.floor(deck.length/2);
        Deck d1 = subdeck(0, midpoint);
        Deck d2 = subdeck(midpoint, deck.length);
        Deck sorted = mergeSort(d1, d2);
        return sorted;
    }

    /**
     * Reorders the cards (in place) using insertion sort.
     */
    public void insertionSort() {
        for (int i = 0; i < deck.length; i++) {
            Card temp = cards[i];
            int j;
            for (j = i-1; j >= 0 && temp < cards[j]; j--) {
                cards[j+1] = cards[j];
            }
            cards[j+1] = temp;
        }
    }

}
