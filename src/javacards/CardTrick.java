 /*
 Name - Omkarsinh
 Student ID- 991700099
 */
package javacards;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int) (Math.random() * 13));
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i] = c;
        }
        
        // Created lucky card     
        Card luckyCard = new Card();
        luckyCard.setValue(1);
        luckyCard.setSuit("Spade");   
     
     

        // Search magicHand for the user's card
        boolean found = false;
        for (Card magicHand1 : magicHand) {
            if (magicHand1.equals(luckyCard)) {
                found = true;
                break;
            }
        }

        // Report the result
        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }

    }
    
}
