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
public class Card {
    private String rank;
    private String suit;
    
    public Card(String rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }
  
    public String get_rank(){
        return this.rank;
    }
    
    public String get_suit(){
        return this.suit;
    }
    
}
