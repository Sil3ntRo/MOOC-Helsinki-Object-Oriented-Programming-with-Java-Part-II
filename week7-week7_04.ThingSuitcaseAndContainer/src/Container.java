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

public class Container {
    private int maxWeightLimit;
    private ArrayList<Suitcase> container;
    
    public Container(int maxWeight) {
        this.maxWeightLimit = maxWeight;
        this.container = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if((totalWeightContain() + suitcase.totalWeight() <= this.maxWeightLimit)) {
            container.add(suitcase);
        }
    }
    
    public int totalWeightContain() {
        int weight = 0;
        for(Suitcase suit : this.container) {
            weight += suit.totalWeight();
        }
        return weight;
    }
    
    public void printThings() {
        for(Suitcase suit : this.container) {
            suit.printThings();
        }
    }
    
    public String toString() {
        return container.size() + " suitcases " + "(" + totalWeightContain() + " kg)";
    }
    
}
