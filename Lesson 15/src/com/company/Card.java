package com.company;

/***/


public class Card {

    /** Properties:*/
    //rank:String Tells value of the cards. Example:2, 3, A, K etc.
    //suit:String Tells value of suit. Example: Clubs, Spade, Diamond or Hearts ♠️♣️♥️♦️

    private final String rank; //A ,K, Q, 10, 9

    private final String suit; /**   ♠️     ♣️      ♥️      ♦️     */




    /** Constructor*/
    //Card(String suit, String rank)

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /** Methods:*/
    //String getRank():Tell us the rank of the card.
    //String getSuit():Tell us the suit of the card.
    //int getValue():Instruction: Use Switch Case! also, for aces return 11.
    //String toString()


    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return rank + " of "+ suit;//Queen of hears
    }


    //computer property
    public int getValue(){
        switch (rank){
            case " K ":
            case " Q ":
            case " J ":
                return 10;
            case " A ":
                return 11;
            default:
                //2, 3, 4, 5, 6, 7, 8, 9, 10
                return Integer.valueOf(rank);
        }

    }






}
