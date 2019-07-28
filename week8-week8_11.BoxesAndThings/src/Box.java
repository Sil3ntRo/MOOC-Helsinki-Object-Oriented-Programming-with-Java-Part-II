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

public class Box implements ToBeStored {
    private double maxWeight;
    private ArrayList<ToBeStored> things;
    
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<ToBeStored>();
        double weight = 0.0;
    }
    
    public void add(ToBeStored thing) {
        double weight = 0.0;
        if((this.weight() + thing.weight()) <= maxWeight) {
            things.add(thing);
            weight += thing.weight();
        }
        else {
            System.out.println("Sorry! Container exceeds maximum capacity");
        }
    }
    
    
    public double weight() {
        double totalWeight = 0.0;
        for(ToBeStored items : things) {
            totalWeight += items.weight();
        }
        return totalWeight;
    }
    
    public void printContents() {
        for(ToBeStored contents : things) {
            System.out.println(contents);
        }
    }
    
    @Override
    public String toString() {
        return "Box: " + things.size() + " things, total weight " + weight() + " kg";
    }
    
}
