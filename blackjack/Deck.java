import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    public static final int NUMFACES = 13;
    public static final int NUMSUITS = 4;
    public static final int NUMCARDS = 52;
    public static final String SUITS[] = { "CLUBS", "SPADES", "DIAMONDS", "HEARTS" };
    private int topCardIndex;
    private ArrayList<Card> stackOfCards;

    public Deck() {
        // initialize data - stackOfCards - topCardIndex
        stackOfCards = new ArrayList<Card>(); // Initialize the ArrayList
        topCardIndex = NUMCARDS - 1; // Set topCardIndex to the last index of the deck

        // loop through suits
        // loop through faces
        // add in a new card
        for (int i = 0; i < NUMSUITS; i++) {
            for (int j = 0; j < NUMFACES; j++) {
                stackOfCards.add(new Card(j + 1, SUITS[i])); // Create a new Card and add it to the deck
            }
        }
    }

    // modifiers
    public void shuffle() {
        // shuffle deck
        Collections.shuffle(stackOfCards);
        // reset variables as needed
        topCardIndex = NUMCARDS - 1;
    }

    // accessors
    public int size() {
        return stackOfCards.size();
    }

    public int numCardsLeft() {
        return topCardIndex + 1;
    }

    public Card nextCard() {
        if (topCardIndex >= 0) {
            return stackOfCards.get(topCardIndex--);
        } else {
            return null; //if deck is empty
        }
    }

    public String toString() {
        return stackOfCards + " topCardIndex = " + topCardIndex;
    }
}
