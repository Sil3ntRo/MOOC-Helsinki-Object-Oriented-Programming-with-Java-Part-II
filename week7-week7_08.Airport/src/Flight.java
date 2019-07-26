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

public class Flight {
    private String planeID;
    private String departure;
    private String destination;
    
    public Flight(String planeID, String departure, String destination) {
        this.planeID = planeID;
        this.departure = departure;
        this.destination = destination;
    }
    
    public String getPlaneID() {
        return this.planeID;
    }
    
    @Override
    public String toString() {
        return "(" + this.departure + "-" + this.destination + ")";
    }
}
