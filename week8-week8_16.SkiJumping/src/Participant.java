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
import java.util.Objects;

public class Participant implements Comparable<Participant> {
    private String name;
    private int points;
    private ArrayList<Integer> accumJump;
    
    public Participant(String name) {
        this.name = name;
        this.points = 0;
        this.accumJump = new ArrayList<Integer>();
    }
    
    public String getName() {
        return this.name;
    }
    
    public void addJump(int jump) {
        accumJump.add(jump);
    }
    
    public void addPoints(int points) {
        this.points += points;
    }
    
    public void printJumps() {
        for(int i = 0; i < accumJump.size()-1; i++) {
            System.out.print(accumJump.get(i) + " m, ");
        }
        System.out.print(accumJump.get(accumJump.size()-1) + " m\n");
    }
    
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
            
        }
        
        if(!(obj instanceof Participant)) {
            return false;
            
        }
       
        Participant that = (Participant) obj;
        return this.points == that.points;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.points);
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.points + " points)";
    }
    
    @Override
    public int compareTo(Participant participant) {
        return this.points - participant.points;
    }
    
    
}
