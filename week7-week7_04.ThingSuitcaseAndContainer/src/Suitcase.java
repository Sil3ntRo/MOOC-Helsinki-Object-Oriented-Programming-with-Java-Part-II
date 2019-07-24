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

public class Suitcase {
    private ArrayList<Thing> things; 
    private int maxWeightLimit;
    
    public Suitcase(int maxWeight) {
        this.things = new ArrayList<Thing>();
        this.maxWeightLimit = maxWeight;
    }
    
    public void addThing(Thing thing) {
        if(totalWeight() + thing.getWeight() <= this.maxWeightLimit) {
            things.add(thing);
        }
        
    }
    
    public int totalWeight() {
        int weight = 0;
        for(Thing thing : things) {
           weight += thing.getWeight();
        } 
        return weight;
    }
    
    public Thing heaviestThing() {
        if(things.size() == 0) {
            return null;
        }
        
        Thing heaviest = new Thing("Heaviest", 0);
        
        for(Thing thing : this.things) {
            if(heaviest.getWeight() < thing.getWeight()) {
                heaviest = thing;
            }
        }
        return heaviest;
    }
    
    public void printThings() {
        for(Thing thing: this.things) {
            System.out.println(thing);
        }
    }
    
    public String toString() {
       
       
       if(this.things.size() == 0) {
           return "empty (0 kg)";
       }
       else if(this.things.size() == 1) {
           return this.things.size() + " thing (" + totalWeight() + " kg)";
       }
       
       return things.size() + " things" + " (" + totalWeight() + " kg)";
        
       
    }
}
