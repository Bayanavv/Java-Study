package com.company;
/***/

import javax.smartcardio.Card;
import java.util.ArrayList;

public class Hand {

    /**Properties:*/
        //ArrayList<Card>: cards - a list of cards/
    private ArrayList<Card> cards = new ArrayList<>(); //NullPointerException

    /**Methods:*/
        //void addCard(Card card): Used to add a card to the hand.
        //int getValue(); Tell us the score of the hand.
    public void addCard(Card card){
        cards.add(card);
    }
    public int getValue(){
        int sum = 0;
        for += c.getValue();
        return sum;
    }


    @Override
    public String toString() {
        return "Hand{" +
                "cards=" + cards +
                '}';
    }
}
