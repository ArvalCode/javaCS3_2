public class Dealer extends Player {
    private Deck deck;

    public Dealer() {
        super();
        deck = new Deck();
        shuffle();
    }

    public void shuffle() {
        deck.shuffle();
    }

    public Card deal() {
        if (deck.numCardsLeft() > 0) {
            return deck.nextCard();
        } else {
            System.out.println("The deck is empty.");
            return null;
        }
    }

    public int numCardsLeftInDeck() {
        return deck.numCardsLeft();
    }

    @Override
    public boolean hit() {
        if (getHandValue() >= 17) {
            return false;
        }
        return true;
    }
}
