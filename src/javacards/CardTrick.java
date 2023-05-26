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
 * @modified by Gagandeep Singh #991709762
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicDeck = new Card[7];

        for (int i = 0; i < magicDeck.length; i++) {
            Card card = new Card();
            card.setValue((int) (Math.random() * 13) + 1);
            card.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            magicDeck[i] = card;
        }

        Card userCard = new Card();
        userCard.setValue(7);
        userCard.setSuit(Card.SUITS[2]);
        boolean isCardFound = false;

        for (int i = 0; i < magicDeck.length; i++) {
            if (userCard.getSuit().equals(magicDeck[i].getSuit()) && magicDeck[i].getValue() == userCard.getValue()) {
                isCardFound = true;
                break;
            }
        }

        if (isCardFound) {
            System.out.println("Congratulations! Your card was found in the magic deck!");
        } else {
            System.out.println("Sorry! Your card was not found in the magic deck.");
        }
    }
}
