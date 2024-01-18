public class Card {
    public static final String FACES[] = { "ZERO", "ACE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING" };
    private String suit;
    private int face;

    // constructors
    public Card(int face1, String suit1) {
        face = face1;
        suit = suit1;
    }

    // modifiers
    // accessors
    public int getValue() {
        if (face >= 11 && face <= 13) {  // If the face value is JACK, QUEEN, or KING
            return 10;
        }
        return face;
    }

    public String getSuit() {
        return suit;
    }

    public boolean equals(Object obj, Object obj2) {
        if (obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return FACES[face] + " of " + getSuit() + " | value = " + getValue();
    }
}
