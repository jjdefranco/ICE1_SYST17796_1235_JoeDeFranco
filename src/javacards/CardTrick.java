/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*Modifier name and student id for ICE-1

First Name : Hasan
Last Name : Master

Student Id : 991698598

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
        Card[] magicHand = new Card[7]; // An array of objects
        Random random = new Random(); // To generate random cards
        Scanner input = new Scanner(System.in); //To take value from users


        System.out.println("You can choose any card from the decks, options for the user guidance are as follows :");
        System.out.println("A card can have one of the following list of suits: clubs, hearts, spades, diamonds");
        System.out.println("A card can have a value from 1-13 with the specifications as Ace = 1, Jack -11, Queen =12, King = 13");
        System.out.print("Enter your suit : ");
        String userSuit = input.next(); //Takes the suit value from user
        System.out.print("Enter the card value : ");
        int userValue = input.nextInt(); // Takes the card value from the user



        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            magicHand[i] = c;
            int randomValue = random.nextInt(13) + 1;
            c.setValue(randomValue); // Sets the value of a card in magicHand Array
            int randomSuit = random.nextInt(4);
            c.setSuit(Card.SUITS[randomSuit]); //Sets the Suit of a card in magicHand Array
        }


        String matchCheck = "N"; //To avoid using a method with a return value, we use a pre defined variable and change its value when the card matches
        for (int i =0; i< magicHand.length; i++){
            if (magicHand[i].getSuit().equalsIgnoreCase(userSuit)){
                if(magicHand[i].getValue() == userValue){
                    System.out.println("Succesful, card matched");
                    matchCheck = "Y"; //We change the value of the variable so it doesnt print Did not match
                    break; // Breaks the loop even if the card matches once
                }
            }
        }
        
        if (matchCheck == "N"){
            System.out.println("Did not match"); // Only works when the card by user is not included in the magicHand Array
        }
    }
    
  
}
