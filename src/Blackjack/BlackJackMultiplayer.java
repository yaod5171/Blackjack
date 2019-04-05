package Blackjack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
import static java.lang.System.*;
import java.util.Scanner;

public class BlackJackMultiplayer {

    //add in Player instance variable
    //add in Dealer instance variable
    private Player[] players;
    private Dealer dealer;

    public BlackJackMultiplayer(int playerCount) {
        dealer = new Dealer();
        players = new Player[playerCount];
    }

    public void playGame() {
        Scanner scan = new Scanner(System.in);
        char choice = 0;
        boolean play = true;
        boolean pBust, dBust;
        int[] pVal = new int[players.length];
        int dVal;
        do {
            //deal first cards
            dealer.addCardToHand(dealer.deal());
            dealer.addCardToHand(dealer.deal());
            for (Player p : players) {
                p.addCardToHand(dealer.deal());
                p.addCardToHand(dealer.deal());
            }

            //player hits
            for (Player p : players) {
                while (player.getHandValue() < 21 && player.hit()) {
                    player.addCardToHand(dealer.deal());
                }
            }

            //dealer hits
            while (dealer.hit()) {
                dealer.addCardToHand(dealer.deal());
            }

            //reveal
            for (int i = 0; i < players.length; i++) {
            pVal[i] = players[i].getHandValue();
            

            System.out.println("PLAYER " + (i+1));
            System.out.println("Hand Value: " + pVal[i]);
            System.out.println("Hand size: " + players[i].getHandSize());
            System.out.println("Cards in hand: " + players[i].getHand());
            }

            System.out.println();

            dVal = dealer.getHandValue();
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
        System.out.print("Number of players: ");
        Scanner scan = new Scanner(System.in);
        BlackJackMultiplayer game = new BlackJackMultiplayer(scan.nextInt());
        game.playGame();
    }
}
