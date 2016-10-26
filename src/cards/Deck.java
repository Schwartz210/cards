/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;
import java.util.ArrayList;
import java.util.Collections;
        
/**
 *
 * @author aschwartz
 */
public class Deck {
    public ArrayList<Card> deck;
    public ArrayList<Card> available_cards;
    public ArrayList<Card> unavailable_cards;
    public Deck(){
        factory();

    }
    
    public void factory(){
        deck = new ArrayList<Card>();
        unavailable_cards = new ArrayList<Card>();
        String ranks[] = {"Duce", "Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
        String suits[] = {"Hearts", "Diamonds", "Clubs","Spades"};
        
        for (String i : ranks){
            for (String j : suits){
                Card new_card = new Card(i, j);
                deck.add(new_card);
            }
        }
        available_cards = new ArrayList<Card>(deck);
    }
    
    public static void display(ArrayList<Card> deck){
        for (Card card : deck){
            String s = card.get_rank();
            System.out.println(s);
        }     
    }
    
    public ArrayList<Card> getDeck(){
        return deck;
    }
    
    public void shuffle(){
        Collections.shuffle(available_cards);
        
    }
    
    public ArrayList<Card> draw(int card_quantity){
        ArrayList<Card> pile = new ArrayList<Card>();
        for (int i=0; i<card_quantity;i++){
            pile.add(available_cards.get(0));
            unavailable_cards.add(available_cards.get(0));
            available_cards.remove(0);
        }
        return pile;
    }
    
    public ArrayList<Card> getAvailableCards(){
        return available_cards;
    }
}
