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
        Scanner scan = new Scanner(System.in);
        String response;
        while (true) {
            System.out.println("Current hand: " + super.getHand() + " - value " + super.getHandValue());
            System.out.print("Do you want to hit? (y/n) ");
            response = scan.nextLine().toUpperCase().trim();
            if (response.equals("Y")) {
                return true;
            } else if (response.equals("N")) {
                return false;
            } else {
                System.out.println("Not a valid response");
            }
        }
    }

}
