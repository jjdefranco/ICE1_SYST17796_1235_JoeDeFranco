/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacards;
import java.lang.*;
import java.util.*;

/**
 * @author Adison Dickans Macwan
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
        
        for (int i=0; i<magicHand.length; i++)
        {
            randomNumber = 1 + (int)(Math.random() * ((7 - 1) + 1));
            randomSuit = 0 + (int)(Math.random() * ((3 - 0) + 1));
            magicHand[i] = new Card();
            magicHand[i].setValue(randomNumber);
            magicHand[i].setSuit(Card.SUITS[randomSuit]);
         
        }
        System.out.println("Please input a card number:");
        userCard = input.nextInt();
        input.nextLine();
        System.out.println("Please input a card suit:");
        userSuit = input.nextLine();
        
        Card n = new Card();
        n.setValue(userCard);
        n.setSuit(userSuit);
        
        boolean cardFound = false;
        for(Card card : magicHand){
            if(card.equals(n)){
                cardFound = true;
                break;
            }
        }
        
        if(cardFound){
            System.out.println("Your card is in the magic hand");
            } else {
            System.out.println("Your card is not in the magic hand");
            
        }
        
    }
    
}