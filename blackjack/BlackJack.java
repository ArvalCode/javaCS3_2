//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nolan Tran
//Date -
import java.util.Scanner;

public class BlackJack {
    private Dealer dealer;
    private Player[] players;
    //Player class to store the # of players
    private Scanner scanner;

    public BlackJack(int numPlayers) {
        dealer = new Dealer();
        players = new Player[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            players[i] = new Player();
        }
        scanner = new Scanner(System.in);
    }

    public void playGame() {
        do {
            dealer.resetHand();
            for (Player player : players) {
                player.resetHand();
            }
            dealer.shuffle();

            // Deal first 2 cards
            for (Player player : players) {
                player.addCardToHand(dealer.deal());
                player.addCardToHand(dealer.deal());
            }

            // Deal first 2 cards to dealer
            dealer.addCardToHand(dealer.deal());
            dealer.addCardToHand(dealer.deal());

            for (int i = 0; i < players.length; i++) {
                System.out.println("\n--- Player " + (i + 1) + "'s Turn ---");
                playPlayer(players[i]);
            }

            // play dealer
            System.out.println("\n--- Dealer's Turn ---");
            playDealer(dealer);

            // show hand
            System.out.println("\n--- Final Hands ---");
            System.out.println("\n--- Dealer ---\n" + dealer);
            for (int i = 0; i < players.length; i++) {
                System.out.println("\n--- Player " + (i + 1) + " ---\n" + players[i]);
            }

            determineWinners();

            System.out.println("\nDo you want to play again? [Y/y/N/n] ");
        } while (Character.toUpperCase(scanner.next().charAt(0)) == 'Y');
        //Using the character class function toUpperCase, it efficiently determines 'y' && 'Y' as the same
    }

    private void playPlayer(Player player) {
        // Print player's hand value and cards
        System.out.println("\n" + player);

        // Allow the player to hit as long as they want and hand value < 21
        char charInput;
        do {
            System.out.println("Do you want to hit? [Y/N] ");
            charInput = scanner.next().charAt(0);
            if (Character.toUpperCase(charInput) == 'Y' && player.hit()) {
                player.addCardToHand(dealer.deal());
                System.out.println("\n" + player);
            }
        } while (Character.toUpperCase(charInput) == 'Y' && player.getHandValue() < 21);
    }

    private void playDealer(Dealer dealer) {
        // Print dealer's hand value and cards
        System.out.println("\n" + dealer);

        // Allow the dealer to hit as long as hand value < 17
        while (dealer.hit()) {
            dealer.addCardToHand(dealer.deal());
            System.out.println("\n" + dealer);
        }
    }

    private void determineWinners() {
        int dealerHandValue = dealer.getHandValue();

        for (int i = 0; i < players.length; i++) {
            int playerHandValue = players[i].getHandValue();

            if ((playerHandValue <= 21 && playerHandValue > dealerHandValue) || (dealerHandValue > 21 && playerHandValue <= 21)) {
                System.out.println("\nPlayer " + (i + 1) + " wins!");
                players[i].incrementWinCount();
            } else if (playerHandValue == dealerHandValue) {
                System.out.println("\nIt's a tie for Player " + (i + 1) + "!");
            } else {
                System.out.println("\nDealer wins against Player " + (i + 1) + "!");
                dealer.incrementWinCount();
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int numPlayers = input.nextInt();
        BlackJack game = new BlackJack(numPlayers);
        game.playGame();
    }
}
