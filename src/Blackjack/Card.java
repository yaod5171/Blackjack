package Blackjack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
public abstract class Card {

    public static final String FACES[] = {"ZERO", "ACE", "TWO", "THREE", "FOUR",
        "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING"};

    private String suit;
    private int face;

    //constructors
    public Card(int Face, String Suit) {
        suit = Suit;
        face = Face;
    }

    public Card() {
        suit = "";
        face = 0;
    }

    // modifiers
    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @param face the face to set
     */
    public void setFace(int face) {
        this.face = face;
    }

  	//accessors
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @return the face
     */
    public int getFace() {
        return face;
    }

    public abstract int getValue();

    public boolean equals(Object obj) {

        return false;
    }

  	//toString
    public String toString() {
        return FACES[face] + " of " + suit;
    }
}
