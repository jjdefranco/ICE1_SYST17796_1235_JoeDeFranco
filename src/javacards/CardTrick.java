/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacards;
import java.util.*;
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
            c.setValue(randomNumber());
            c.setSuit(Card.SUITS[randomNumber(0, 3)]);
            magicHand[i] = c;
        }

        // Ask the user for card value and suit
      

        Card luckyCard = new Card();
        luckyCard.setValue(5);
        luckyCard.setSuit("Spade");

        // Search magicHand for the user's card
        boolean cardInMagicHand = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equals(luckyCard.getSuit())) {
                cardInMagicHand = true;
                break;
            }
        }

        // Display the result
        if (cardInMagicHand) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }

    private static int randomNumber() {
        return (int) (Math.random() * 13) + 1;
    }

    private static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}


            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    
