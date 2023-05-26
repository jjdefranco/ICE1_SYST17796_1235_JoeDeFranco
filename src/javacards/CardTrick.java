/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *  Modified by [Kashish Kashish]
 * Student Number: [991708075]
 */
package javacards;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
import java.util.*;

public class CardTrick {
   
  

    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1);//c.setValue(insert call to random number generator here)
            c.setSuit(Card.SUITS[random.nextInt(4)]);//c.setSuit(Card.SUITS[insert call to random number between 0-3 here])

            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        
        
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Hearts");
        // and search magicHand here
        boolean found = false;
        for (int i = 0; i < magicHand.length; i++) {
            Card card = magicHand[i];
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equals(luckyCard.getSuit())) 
            {
            found = true;
            break;
            }
        }
        //Then report the result here
        if (found) {
            System.out.println("Your luckycard is in the magic hand of random cards!");
        } else {
            System.out.println("Your luckycard is not in the magic hand of random cards.");
        }
    
       }
    }
 
