package com.company;
/**♠     ♣      ♥      ♦*/

import java.util.ArrayList;

public class Deck {
    /** Properties:*/
    /** Constructor:*/
    /** Methods:*/
    private ArrayList<Card> cards = new ArrayList<>();

    public Deck(){
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for(String rank : ranks){
            cards.add(new Card(rank, "♠"));
            cards.add(new Card(rank, "♣"));
            cards.add(new Card(rank, "♥"));
            cards.add(new Card(rank, "♦"));
        }

    }

    public Card dealCard(){
        return cards.remove(0);
    }

    //rand(0-51)
    public void shuffle(){

    }

}
