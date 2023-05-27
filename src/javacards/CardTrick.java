/*
 * Sagan Deep Singh 991672953
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
 */
package javacards;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(random.nextInt(12) + 1);
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i] = c;
        }
        Card luckyCard=new Card();
        luckyCard.setValue(1);
        luckyCard.setSuit(2);
     
        System.out.print("pick any card \n Enter the suit of your desired card: ");
        String usersuit = input.next();
        System.out.print("\n Enter the card number: ");
        int uservalue = input.nextInt();

        boolean found = false;
        for (int i = 0; i < magicHand.length; i++) {
            if ((magicHand[i].getSuit().equalsIgnoreCase(usersuit) && magicHand[i].getValue() == uservalue)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Congratulations!! You Win");
        } else {
            System.out.println("Sorry, you lose. Better luck next time");
        }
     
    }

}
