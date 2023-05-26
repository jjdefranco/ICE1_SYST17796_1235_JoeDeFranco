package javacards;
import java.util.*;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Yuvam Meelu 
 * Student ID= 991699198
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1); // Generates a random value between 1 and 13
            c.setSuit(Card.SUITS[random.nextInt(4)]); // Generates a random index between 0 and 3 to select a suit
            magicHand[i] = c;
        }
        
        System.out.print("Enter the value of the card (1-13): ");
        int userValue = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        System.out.print("Enter the suit of the card (Hearts, Diamonds, Clubs, Spades): ");
        String userSuit = scanner.nextLine();
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);
        
        boolean found = false;
        for (Card card : magicHand) {
            if (card.equals(userCard)) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("The magic hand contains your card!");
        } else {
            System.out.println("The magic hand does not contain your card.");
 }
}
}