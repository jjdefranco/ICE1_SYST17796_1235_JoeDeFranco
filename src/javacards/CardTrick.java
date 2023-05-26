/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacards;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result 
        System.out.print("Enter the card value : ");
        int userValue = input.nextInt();
        System.out.print("Enter your suit : ");
        String userSuit = input.next();


        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            magicHand[i] = c;
            int randomValue = random.nextInt(13) + 1;
            c.setValue(randomValue);
            int randomSuit = random.nextInt(4);
            c.setSuit(Card.SUITS[randomSuit]);
        }

        //System.out.print(magicHand[0].getValue());
        for (int i =0; i< magicHand.length; i++){
            if (magicHand[i].getSuit().equalsIgnoreCase(userSuit)){
                if(magicHand[i].getValue() == userValue){
                    System.out.println("Succesful, card matched");
                    break;
                }
            }
        }
    }
}
