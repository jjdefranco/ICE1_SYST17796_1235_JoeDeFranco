/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacards;
import java.lang.*;
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
        int randomNumber;
        int randomSuit;
        Scanner input = new Scanner(System.in);
        int userCard;
        String userSuit;
        boolean cardFound = false;
        
        for (int i=0; i<magicHand.length; i++)
        {
            randomNumber = 1 + (int)(Math.random() * ((7 - 1) + 1));
            randomSuit = 0 + (int)(Math.random() * ((3 - 0) + 1));
            magicHand[i] = new Card();
            magicHand[i].setValue(randomNumber);
            magicHand[i].setSuit(Card.SUITS[randomSuit]);
            System.out.println(magicHand[i].getValue());
            System.out.println(magicHand[i].getSuit());
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        System.out.println("Please input a card number:");
        userCard = input.nextInt();
        
        System.out.println("Please input a card suit:");
        userSuit = input.next();
        
        Card n = new Card();
        n.setValue(userCard);
        n.setSuit(userSuit);
        
        for(Card i: magicHand){
            System.out.println(i.getSuit().equals(n.getSuit()));
            if((i.getValue() == n.getValue()) && (i.getSuit().equals(n.getSuit()))){
                cardFound = true;
            }
        }
        
        if(cardFound){
            System.out.println("Card was found");
        }else{
            System.out.println("Card was not found");
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
