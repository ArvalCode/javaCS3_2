import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand;
    private int winCount;

    public Player() {
        hand = new ArrayList<Card>();
        winCount = 0;
    }

    public Player(int score) {
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
        if (getHandValue() < 21) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Hand: " + hand + "\n-" + getHandValue();
    }

    public void incrementWinCount() {
        winCount++;
    } 
}
