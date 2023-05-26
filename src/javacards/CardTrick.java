// Student ID: 191709389
import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    private Card[] magicHand;
    
    public MagicHand() {
        magicHand = new Card[7];
        fillMagicHand();
    }
    /**
 * This is a public class that represents a coin.
 *
 * @modifier OsmanGoniOpi
 */


    
    private void fillMagicHand() {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        Random random = new Random();
        
        for (int i = 0; i < magicHand.length; i++) {
            int suitIndex = random.nextInt(suits.length);
            int rankIndex = random.nextInt(ranks.length);
            String suit = suits[suitIndex];
            String rank = ranks[rankIndex];
            
            Card card = new Card(rank, suit);
            magicHand[i] = card;
        }
    }
    
   Card luckyCard = new Card();
        luckyCard.setValue(10); // Example: Set the lucky card value to 10
        luckyCard.setSuit("Hearts"); // Example: Set the lucky card suit to Hearts

        boolean foundUserCard = false;
        boolean foundLuckyCard = false;
        
        
        String[] inputParts = input.split(" ");
        if (inputParts.length != 2) {
            System.out.println("Invalid input. Please provide a valid rank and suit.");
            return;
        }
        
        String rank = inputParts[0];
        String suit = inputParts[1];
        Card userCard = new Card(rank, suit);
        
        boolean found = false;
        for (Card card : magicHand) {
            if (card.equals(userCard)) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }
    
    public static void main(String[] args) {
        MagicHand magicHand = new MagicHand();
        magicHand.pickCard();
    }
}
