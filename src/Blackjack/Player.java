package Blackjack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
import java.util.ArrayList;
import static java.lang.System.*;
import java.util.Scanner;

//define Player class here 
class Player extends AbstractPlayer {

	//constructors
    public Player() {
        super();
    }
    public Player(ArrayList<Card> Hand) {
        super(Hand);
    }
    public Player(ArrayList<Card> Hand, int WinCount) {
        super(Hand, WinCount);
    }
    
	//hit method goes here
    @Override
    public boolean hit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
