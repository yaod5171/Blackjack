package Blackjack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
import static java.lang.System.*;
import java.util.Scanner;

public class BlackJack {

    //add in Player instance variable
    //add in Dealer instance variable
    private Player player;
    private Dealer dealer;

    public BlackJack() {
        dealer = new Dealer();
        player = new Player();
    }

    public void playGame() {
        Scanner scan = new Scanner(System.in);
        char choice = 0;
        boolean play = true;
        boolean pBust, dBust;
        int pVal, dVal;
        do {
            //deal first cards
            player.addCardToHand(dealer.deal());
            dealer.addCardToHand(dealer.deal());
            player.addCardToHand(dealer.deal());
            dealer.addCardToHand(dealer.deal());

            //player hits
            while (player.getHandValue() < 21 && player.hit()) {
                player.addCardToHand(dealer.deal());

            }

            //dealer hits
            while (dealer.hit()) {
                dealer.addCardToHand(dealer.deal());
            }

            //reveal
            pVal = player.getHandValue();
            dVal = dealer.getHandValue();

            System.out.println("PLAYER");
            System.out.println("Hand Value: " + pVal);
            System.out.println("Hand size: " + player.getHandSize());
            System.out.println("Cards in hand: " + player.getHand());

            System.out.println();

            System.out.println("DEALER");
            System.out.println("Hand Value: " + dVal);
            System.out.println("Hand size: " + dealer.getHandSize());
            System.out.println("Cards in hand: " + dealer.getHand());

            //determine winner
            pBust = pVal > 21;
            dBust = dVal > 21;
            if (pBust && dBust) {
                System.out.println("Both busted!");
            } else if (pBust) {
                System.out.println("Dealer wins - Player busted!");
                dealer.win();
            } else if (dBust) {
                System.out.println("Player wins - Dealer busted!");
                player.win();
            } else {
                if (dVal > pVal) {
                    System.out.println("Dealer has bigger hand value!");
                    dealer.win();
                } else if (pVal > dVal) {
                    System.out.println("Player has bigger hand value!");
                    player.win();
                } else {
                    System.out.println("Tie!");
                }
            }

            System.out.println();

            //show win counts
            System.out.println("Dealer has won " + dealer.getWinCount() + " times.");
            System.out.println("Player has won " + player.getWinCount() + " times.");

            //reset for next game
            player.resetHand();
            dealer.resetHand();
            dealer.shuffle();

            //ask if player wants to keep playing
            while (true) {
                System.out.print("New game? (y/n) ");
                String response = scan.nextLine().toUpperCase().trim();
                if (response.equals("Y")) {
                    play = true;
                    System.out.println("\n--------\n");
                    break;
                } else if (response.equals("N")) {
                    play = false;
                    break;
                } else {
                    System.out.println("Not a valid response");
                }
            }

        } while (play);
    }

    public static void main(String[] args) {
        BlackJack game = new BlackJack();
        game.playGame();
    }
}
