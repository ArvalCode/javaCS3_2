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
        stackOfCards = new ArrayList<Card>(); 
        topCardIndex = NUMCARDS - 1; 

        for (int i = 0; i < NUMSUITS; i++) {
            for (int j = 0; j < NUMFACES; j++) {
                stackOfCards.add(new Card(j+1, SUITS[i]));
            }
        }
    }

    // modifiers
    public void shuffle() {
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

    public void removeCard() {
        if (topCardIndex >= 0) {
            stackOfCards.remove(topCardIndex--);
        } else {
            System.out.println("No cards left in the deck.");
        }
    }
    

    public String toString() {
        return stackOfCards + " topCardIndex = " + topCardIndex;
    }
}
