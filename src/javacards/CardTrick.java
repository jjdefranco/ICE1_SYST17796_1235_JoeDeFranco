/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
            magicHand[i]=c;
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random()*13));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random()*3)]);
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the card value: ");
        int cardValue=input.nextInt();
        System.out.println("Enter the Suit: ");
        String suit=input.next();
        Card c2=new Card();
        c2.setValue(cardValue);
        c2.setSuit(suit);
        
        for(int i=0;i<magicHand.length;i++){
            if((magicHand[i].getValue()==c2.getValue())&&(magicHand[i].getSuit().equalsIgnoreCase(c2.getSuit()))){
                System.out.println("Card Matched!");
                break;
            }
            else
                System.out.println("Card Did not match");
        }
        // and search magicHand here
        //Then report the result here
    }
    
}
