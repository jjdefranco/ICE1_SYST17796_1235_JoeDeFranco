/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacards;

 import java.util.Random; 
 import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * Modifier: Sushant Mnahas
 * Student Number: 991708713
 * Date Modified: 2023-05-25
 * 
 * @author dancye
 */

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            Random random = new Random();
            
           int cardValue = random.nextInt(13) + 1; 
           
            int suitIndex = random.nextInt(4);

             c.setValue(cardValue);
             
            c.setSuit(Card.SUITS[suitIndex]);
            
            magicHand[i] = c;
            
          
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your card value: ");
        int userValue = scanner.nextInt();
        System.out.print("Enter your card suit (Spades, Hearts, Diamonds, Clubs): ");
        String userSuit = scanner.next();
        
        // Create user's card object
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);
        
        // Search for user's card in magicHand
        boolean foundMatch = false;
        for (Card card : magicHand) {
            if (card.equals(userCard)) {
                foundMatch = true;
                break;
            }
        }
        
        // Report the result
        if (foundMatch) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        
    }
      
    }
}
// Creating a lucky card
        Card luckyCard = new Card();
        luckyCard.setValue(10);
        luckyCard.setSuit("Diamonds");
        
        // Search for the lucky card in magicHand
        boolean foundLuckyCard = false;
        for (Card card : magicHand) {
            if (card.equals(luckyCard)) {
                foundLuckyCard = true;
                break;
            }
        }

        // Report the result for the lucky card
        if (foundLuckyCard) {
            System.out.println("Congratulations! The lucky card is in the magic hand.");
        } else {
            System.out.println("Sorry, the lucky card is not in the magic hand.");
        }
    }
}
