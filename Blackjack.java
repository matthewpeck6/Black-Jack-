import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        //Random Number
        P1Random rng = new P1Random();
        int card = rng.nextInt(13) + 1;

        //establish variables
        int hand = 0;
        int dealerHand = 0;
        int player = 0;
        int dealer = 0;
        int tie = 0;
        int games = 1;
        double percentage = 0.0;

        //Scanner
        Scanner option = new Scanner(System.in);
        System.out.println("START GAME #1");
        System.out.println();

        //Determine Card Name and Hand Value
        hand = hand + card;
        if (card == 13) {
            System.out.println("Your card is a KING!");
            card = 10;
        } else if (card == 12) {
            System.out.println("Your card is a QUEEN!");
            card = 10;
        } else if (card == 11) {
            System.out.println("Your card is a JACK!");
            card = 10;
        } else if (card == 1) {
            System.out.println("Your card is a ACE!");
        } else {
            System.out.println("Your card is a " + card + "!" );
        }
        System.out.println("Your hand is: " + hand);
        System.out.println();

        //Option and user choice
        System.out.println("1. Get another card ");
        System.out.println("2. Hold hand ");
        System.out.println("3. Print statistics ");
        System.out.println("4. Exit");
        System.out.println();
        System.out.print("Choose an option: ");
        int num = option.nextInt();

        //if and while statements for user input
        while (num != 4)
        {
            if (num == 1) {
                card = rng.nextInt(13) + 1;

                //Gives the user another card
                if (card == 13) {
                    System.out.println("Your card is a KING!");
                    card = 10;
                } else if (card == 12) {
                    System.out.println("Your card is a QUEEN!");
                    card = 10;
                } else if (card == 11) {
                    System.out.println("Your card is a JACK!");
                    card = 10;
                } else if (card == 1) {
                    System.out.println("Your card is a ACE!");
                } else {
                    System.out.println("Your card is a " + card + "!" );
                }
                hand = hand + card;
                System.out.println("Your hand is: " + hand);
                System.out.println();

                //Check for a blackjack or greater
                if ((hand > 21)){
                    System.out.println("You exceeded 21! You lose.");
                    dealer++;
                    //Start new game and reset values
                    System.out.println();
                    games++;
                    System.out.println("START GAME #" + games);
                    num = 0;
                    card = 0;
                    hand = 0;
                    dealerHand = 0;

                    //Pull the first card for the user
                    card = rng.nextInt(13) + 1;
                    if (card == 13) {
                        System.out.println("Your card is a KING!");
                        card = 10;
                    } else if (card == 12) {
                        System.out.println("Your card is a QUEEN!");
                        card = 10;
                    } else if (card == 11) {
                        System.out.println("Your card is a JACK!");
                        card = 10;
                    } else if (card == 1) {
                        System.out.println("Your card is a ACE!");
                    } else {
                        System.out.println("Your card is a " + card + "!" );
                    }
                    hand = hand + card;
                    System.out.println("Your hand is: " + hand);
                    System.out.println();
                }
                if ((hand == 21)){
                    System.out.println("BLACKJACK! You win!");
                    player++;
                    //Start new game and reset values
                    System.out.println();
                    games++;
                    System.out.println("START GAME #" + games);
                    num = 0;
                    card = 0;
                    hand = 0;
                    dealerHand = 0;

                    //Pull the first card for the user
                    card = rng.nextInt(13) + 1;
                    if (card == 13) {
                        System.out.println("Your card is a KING!");
                        card = 10;
                    } else if (card == 12) {
                        System.out.println("Your card is a QUEEN!");
                        card = 10;
                    } else if (card == 11) {
                        System.out.println("Your card is a JACK!");
                        card = 10;
                    } else if (card == 1) {
                        System.out.println("Your card is a ACE!");
                    } else {
                        System.out.println("Your card is a " + card + "!" );
                    }
                    hand = hand + card;
                    System.out.println("Your hand is: " + hand);
                    System.out.println();
                }

                //Option and user choice
                System.out.println("1. Get another card ");
                System.out.println("2. Hold hand ");
                System.out.println("3. Print statistics ");
                System.out.println("4. Exit");
                System.out.println();
                System.out.print("Choose an option: ");
                num = option.nextInt();

            } else if (num == 2) {
                //Option 2 Display
                dealerHand = rng.nextInt(11) + 16;
                System.out.println("Dealer's hand: " + dealerHand);
                System.out.println("Your hand is: " + hand);

                //Checking the result
                if ((hand > 21)){
                    System.out.println("You exceeded 21! You lose.");
                    dealer++;
                } else if ((hand == 21)){
                    System.out.println("BLACKJACK! You win!");
                    player++;
                } else if ((dealerHand > 21) && (hand < 21)){
                    System.out.println("You win!");
                    player++;
                } else if ((hand < 21) && (dealerHand<=21) && (hand < dealerHand)) {
                    System.out.println("Dealer wins!");
                    dealer++;
                } else if ((hand < 21) && (dealerHand <= 21) && (hand == dealerHand)) {
                    System.out.println("It's a tie! No one wins!");
                    tie++;
                } else if ((hand < 21) && (dealerHand <= 21) && (hand > dealerHand)) {
                    System.out.println("You win");
                    player++;
                } else {
                }

                //Start new game and reset values
                System.out.println();
                games++;
                System.out.println("START GAME #" + games);
                num = 0;
                card = 0;
                hand = 0;
                dealerHand = 0;

                //Pull the first card for the user
                card = rng.nextInt(13) + 1;
                if (card == 13) {
                    System.out.println("Your card is a KING!");
                    card = 10;
                } else if (card == 12) {
                    System.out.println("Your card is a QUEEN!");
                    card = 10;
                } else if (card == 11) {
                    System.out.println("Your card is a JACK!");
                    card = 10;
                } else if (card == 1) {
                    System.out.println("Your card is a ACE!");
                } else {
                    System.out.println("Your card is a " + card + "!" );
                }
                hand = hand + card;
                System.out.println("Your hand is: " + hand);
                System.out.println();

                //User Options Menu
                System.out.println("1. Get another card ");
                System.out.println("2. Hold hand ");
                System.out.println("3. Print statistics ");
                System.out.println("4. Exit");
                System.out.println();
                System.out.print("Choose an option: ");
                num = option.nextInt();

            } else if (num == 3) {
                //Print Statistics
                System.out.println("Number of Player wins: " + player);
                System.out.println("Number of Dealer wins: " + dealer);
                System.out.println("Number of tie games: " + tie);
                games = games - 1;
                System.out.println("Total # of games played is: " + (games));
                percentage = (double)player / (double)(games);
                percentage = percentage * 100;
                System.out.println("Percentage of Player wins: " + percentage + "%");
                games++;

                //User Options Menu
                num = 0;
                System.out.println("1. Get another card ");
                System.out.println("2. Hold hand ");
                System.out.println("3. Print statistics ");
                System.out.println("4. Exit");
                System.out.println();
                System.out.print("Choose an option: ");
                num = option.nextInt();

            } else {
                System.out.println("Invalid input!");
                System.out.println("Please enter an integer value between 1 and 4.");
                System.out.println();
                System.out.println("1. Get another card ");
                System.out.println("2. Hold hand ");
                System.out.println("3. Print statistics ");
                System.out.println("4. Exit");
                System.out.println();
                System.out.print("Choose an option: ");
                num = option.nextInt();
            }

        }

    }
}
