package Blackjack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
//define Dealer class here
class Dealer extends AbstractPlayer {

    //instance variable - Deck 
    private Deck deck;

    //constructors
    public Dealer() {
        super();
        deck = new Deck();
        shuffle();
    }

    //method to shuffle
    public void shuffle() {
        deck.shuffle();
    }

    //method to deal a card
    public Card deal() {
        return deck.nextCard();
    }

    //hit method goes here
    @Override
    public boolean hit() {
        if (super.getHandValue() < 17) {
            super.addCardToHand(deal());
            return true;
        }
        return false;
    }

}
