import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand;
    private int winCount;

    public Player() {
        // Initialize hand & set win count to 0
        hand = new ArrayList<Card>();
        winCount = 0;
    }

    public Player(int score) { //Sets initial score when making player class
        winCount = score;
        hand = new ArrayList<Card>();
    }

    public void addCardToHand(Card temp) {
        hand.add(temp);
    }

    public void resetHand() {
        hand.clear();
    }

    public void setWinCount(int numWins) {
        winCount = numWins;
    }

    public int getWinCount() {
        return winCount;
    }

    public int getHandSize() {
        return hand.size();
    }

    public int getHandValue() {
        int totalValue = 0;
        for (Card card : hand) {
            totalValue += card.getValue();
        }
        return totalValue;
    }

    public boolean hit() {
        // Implement the logic for deciding whether the player wants to "hit" in the game
        // For example, based on the total value of cards in hand
        // Return true if the player chooses to hit, false otherwise
        // You'll need to define the logic based on the rules of your card game
        return false;
    }

    @Override
    public String toString() {
        return "Hand: " + hand + "\n-" + getHandValue();
    } 
}
