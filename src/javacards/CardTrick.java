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
 * for the match to the user's card.
 * Created by Akshita Sharma (Modifier: 991706738).
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magic = new Card[7];

        for (int i = 0; i < magic.length; i++) {
            Card c = new Card();
            c.setValue(generateRandomValue());
            c.setSuit(Card.SUITS[generateRandomNumber(0, 3)]);
            magic[i] = c;
        }
        
        Card luckyCard = new Card();
        luckyCard.setValue(10); // Example: Set the lucky card value to 10
        luckyCard.setSuit("Hearts"); // Example: Set the lucky card suit to Hearts

        boolean foundUserCard = false;
        boolean foundLuckyCard = false;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a card value: ");
        int value = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Pick a card suit (Hearts, Diamonds, Clubs, Spades): ");
        String suit = scanner.nextLine();

        Card choosenCard = new Card();
        choosenCard.setValue(value);
        choosenCard.setSuit(suit);

        boolean found = false;
        for (Card card : magic) {
            if (card.getValue() == choosenCard.getValue() && card.getSuit().equalsIgnoreCase(choosenCard.getSuit())) {
                found = true;
                break;
            }
        }

       if (foundUserCard && foundLuckyCard) {
           
            System.out.println("Congratulations! You found your card and the lucky card!");
           
        }
        else if (foundUserCard) {
            
            System.out.println("Congratulations! You found your card, but not the lucky card.");
            
        } 
        else if (foundLuckyCard) {
            
            System.out.println("Sorry, you didn't find your card, but you found the lucky card!");
            
        } 
        else {
           
            System.out.println("Sorry, you neither find your card nor the lucky card.");
          
        }
    }


    private static int generateRandomNumber(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }
// Generating random values between 2 and 14 (inclusive)
    private static int generateRandomValue() {
        return generateRandomNumber(2, 14); 
    }
}
