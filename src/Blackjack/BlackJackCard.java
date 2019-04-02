package Blackjack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
public class BlackJackCard extends Card {

    //constructors

    public BlackJackCard() {
        super();
    }

    public BlackJackCard(int Face, String Suit) {
        super(Face, Suit);
    }

    /**
     * Gets the value of a blackjack card.
     *
     * @return the value of the card
     */
    @Override
    public int getValue() {
        if (super.getFace() == 1) {
            return 11;
        }
        if (super.getFace() > 10) {
            return 10;
        }
        return super.getFace();
    }
    
    @Override
    public String toString() {
        return super.toString() + " | value = " + getValue();
    }

}
