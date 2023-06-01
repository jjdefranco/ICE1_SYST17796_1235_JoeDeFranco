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
        boolean lucky = false;
        
        for (int i=0; i<magicHand.length; i++)
        {
            randomNumber = 0 + (int)(Math.random() * ((9 - 0) + 1));
            randomSuit = 0 + (int)(Math.random() * ((3 - 0) + 1));
            magicHand[i] = new Card();
            magicHand[i].setValue(randomNumber);
            magicHand[i].setSuit(Card.SUITS[randomSuit]);
            System.out.println(magicHand[i].getValue());
            System.out.println(magicHand[i].getSuit());
        }
        
        System.out.println("Please input a card number:");
        userCard = input.nextInt();
        
        System.out.println("Please input a card suit:");
        userSuit = input.next();
        
        Card n = new Card();
        n.setValue(userCard);
        n.setSuit(userSuit);
        
        Card luckyCard = new Card();
        luckyCard.setValue(5);
        luckyCard.setSuit("Diamonds");
        
        for(Card i: magicHand){
            if((i.getValue() == n.getValue()) && (i.getSuit().equals(n.getSuit()))){
                cardFound = true;
                break;
            }
            if((i.getValue() == luckyCard.getValue()) && (i.getSuit().equals(luckyCard.getSuit()))){
                lucky = true;
                break;
            }
        }
        
        if(cardFound == true){
            System.out.println("Card was found");
        }else{
            System.out.println("Card was not found");
        }
        if(lucky == true){
            System.out.println("Congratulations the lucky card was in your deck!");
        }else{
            System.out.println("Unfortunately the lucky card was not in your deck. Good luck next time!");
        }
    }
    
}
