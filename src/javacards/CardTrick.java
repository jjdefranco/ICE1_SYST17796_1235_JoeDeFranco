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
 * @author Anuvanshika Sharma
 * Student NO. 991702477
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
            c.setValue(random.nextInt(13) + 1); 
            c.setSuit(Card.SUITS[random.nextInt(4)]); 
            magicHand[i] = c;
        }
        
        Card luckyCard = new Card();
        luckyCard.setValue(5); // Set the value of the lucky card
        luckyCard.setSuit(Card.SUITS[3]); // Set the suit of the lucky card
        
        boolean found = false;
        for (Card card : magicHand) {
            if (card.equals(luckyCard)) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Congratulations! You have the lucky card!");
        } else {
            System.out.println("Sorry, you do not have the lucky card.");
        }
    }
}
