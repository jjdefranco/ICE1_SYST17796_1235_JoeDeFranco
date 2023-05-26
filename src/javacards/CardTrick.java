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
        Card userCard = new Card();
        boolean check = false;
        Card [] magicHand = new Card[7];
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            int randomValue = (int)(Math.random()*12+1);
            int randomSuit= (int)(Math.random()*2+1);
            c.setValue(randomValue);
            c.setSuit(Card.SUITS[randomSuit]);
            magicHand[i] = c;
        }
        Scanner userInput = new Scanner(System.in);
        //insert code to ask e user for Card value and suit, create their card
        System.out.print("Enter the Card Value: ");
        int cardValue = userInput.nextInt();
        userInput.nextLine();
        System.out.print("Enter the Suit(Hearts, Diamonds, Spades, Clubs): ");
        String suitValue = userInput.nextLine();
        userCard.setValue(cardValue);
        userCard.setSuit(suitValue);
        // and search magicHand here
        for (int i=0; i<magicHand.length;i++){
            if(userCard.getValue()==magicHand[i].getValue() && userCard.getSuit().equals(magicHand[i].getSuit())){
                check = true;
                break;
            }
        }
        //Then report the result here
        if (check) {
            System.out.println("Your card is in the magic hand.");
        } else {
            System.out.println("Sorry! Your card is not in the magic hand.");
        }
        
    }
    
}
