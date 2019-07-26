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
import java.util.HashMap;
import java.util.Map;

public class Airport {
    private HashMap<Airplane, Flight> activeFlights;
    private ArrayList<Airplane> flights;
    private ArrayList<Flight> flightRecord;
    
    public Airport() {
        activeFlights = new HashMap<Airplane, Flight>();
        flights = new ArrayList<Airplane>();
        flightRecord = new ArrayList<Flight>();
    }
    
    public void addPlane(String planeID, int capacity) {
        this.flights.add(new Airplane(planeID, capacity));
    }
    
    public void addFlight(String planeID, String departure, String destination) {
        this.flightRecord.add(new Flight(planeID, departure, destination));
    }
    
    public void printPlanes() {
        for(Airplane plane : flights) {
            System.out.println(plane);
        }
    }
    
    public void printPlaneRecord(String planeID) {
        for(Airplane plane : flights) {
            if(plane.getPlaneID().equals(planeID)) {
                System.out.println(plane);
            }
        }
    }
    
    public void printFlightRecord() {
        for(Flight flight : flightRecord) {
            for(Airplane plane : flights) {
                if(plane.getPlaneID().equals(flight.getPlaneID())) {
                    System.out.println(plane + " " + flight);
                }
            }
        }
    }
}
