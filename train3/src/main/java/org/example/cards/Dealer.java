package org.example.cards;

public class Dealer {

    private Card card;
    public Card getCard(){
        return card;
    }

    public void dealCard(Rank rank, Suit suit){
        card = new Card(rank,suit);
    }

}

