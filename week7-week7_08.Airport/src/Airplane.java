/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rohan
 */
public class Airplane {
    private String planeID;
    private int planeCapacity;
    
    public Airplane(String planeID, int planeCapacity) {
        this.planeID = planeID;
        this.planeCapacity = planeCapacity;
    }
    
    public String getPlaneID() {
        return this.planeID;
    }
    
    public int getPlaneCapacity() {
        return this.planeCapacity;
    }
    
    public String toString() {
        return getPlaneID() + " (" + getPlaneCapacity() + " ppl)";
    }
}
