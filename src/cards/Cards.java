/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

/**
 *
 * @author aschwartz
 */
import java.util.ArrayList;
public class Cards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Deck d = new Deck();
        d.shuffle();
        ArrayList<Card> deck = new ArrayList();
        deck = d.getDeck();
        ArrayList<Card> hand = new ArrayList();
        hand = d.draw(5);
        for (Card card : hand){
            System.out.print(card.get_rank());
            System.out.print(" - ");
            System.out.println(card.get_suit());
        }
                
    }
    
}

