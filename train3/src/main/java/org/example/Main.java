package org.example;

import org.example.cards.*;

import javax.swing.plaf.DimensionUIResource;

//Elena
public class Main 
{
    public static void main( String[] args ) {
//        Transport car = new Transport("car1", "bike1", Speed.MEDIUM);
//        System.out.println(car);

//        Dealer dealer = new Dealer();
//        dealer.dealCard(Rank.TEN, Suit.HEART);
//        Card dealtCard = dealer.getCard();
//        System.out.println(dealtCard);
//
        Transport[] transports = new Transport[3];
        transports[0] = new Car();
        transports[1] = new Transport();
        transports[2] = new Bike();

        for (Transport t : transports){
            t.transportTool();
        }
    }
}
