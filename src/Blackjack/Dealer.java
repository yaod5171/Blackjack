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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
