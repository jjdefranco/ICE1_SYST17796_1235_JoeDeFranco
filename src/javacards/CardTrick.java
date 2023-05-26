package javacards;
import java.util.*;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then it search the randomly generated array of 7 cards for the hard-coded lucky card. To be used as starting code in ICE 1
 * @author Yuvam Meelu 
 * Student ID= 991699198
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        
        
        for (int i = 0; i < magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1); // Generates a random value between 1 and 13
            c.setSuit(Card.SUITS[random.nextInt(4)]); // Generates a random index between 0 and 3 to select a suit
            magicHand[i] = c;
        }

        int LuckyValue = 7;
        

        String LuckySuit = "Spades";
        
                Card LuckyCard = new Card();
        LuckyCard.setValue(LuckyValue);
        LuckyCard.setSuit(LuckySuit);
        
        boolean found = false;
        for (Card card : magicHand) {
            if (card.equals(LuckyCard)) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("The magic hand contains your Lucky card!");
        } else {
            System.out.println("The magic hand does not contain your Lucky card.");
 }
}
}
