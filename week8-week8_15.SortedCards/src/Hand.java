/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rohan
 */
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    
    private final ArrayList<Card> hand;
    
    public Hand() {
        this.hand = new ArrayList<Card>();
    }
    
    public void add(Card card) {
        this.hand.add(card);
    }
    
    @Override
    public int compareTo(Hand compare) {
        int sum1 = 0;
        int sum2 = 0;
        
        for(Card each : compare.hand) {
            sum1 += each.getValue();
        }
        
        for(Card each : this.hand) {
            sum2 += each.getValue();
        }
        
        
        
         return sum2 - sum1;
        
    }
    
    public void print() {
        for(Card each : this.hand) {
            System.out.println(each);
        }
    }
    
    public void sort() {
        Collections.sort(this.hand);
    }
    
    public void sortAgainstSuit() {
        Collections.sort(this.hand, new SortAgainstSuitAndValue());
    }
}
