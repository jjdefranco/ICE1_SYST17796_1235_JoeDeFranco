/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        boolean cardFound = false;
        for (int i=0; i<magicHand.length; i++)
        {
            magicHand[i] = new Card();
            magicHand[i].setValue(generateRandomNum(0,9));
            magicHand[i].setSuit(Card.SUITS[generateRandomNum(0,3)]);
        }
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter value for the card");
        int cardValue=scan.nextInt();
        System.out.println("Enter value for the suit");
        String suitValue = scan.next();
        

        //insert code to ask the user for Card value and suit, create their card
        for(Card i: magicHand){
            if((i.getSuit().equals(suitValue)) && (i.getValue() == cardValue)){
                cardFound = true;
            }
        }
        if(cardFound){
            System.out.println("CONGO!yOUR CARD IS IN THE MAGIC HAND");
        }else{
            System.out.println("ALAS!yOUR CARD IS NOT IN THE MAGIC HAND");
        }
        // and search magicHand here
        //Then report the result here
    }
    
    public static int generateRandomNum(int start, int end){
        return start + (int)(Math.random() * ((end - start) + 1));
    }
    
}
