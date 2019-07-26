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
import java.util.Scanner;

public class TextUserInterface {
    private Scanner sc;
    private Airport airport;
    
    public TextUserInterface(Scanner sc, Airport airport) {
        this.sc = sc;
        this.airport = airport;
    }
    
    public void printStartAirportInfo() {
        System.out.println("Choose Operation: ");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.print("> ");
    }
    
    public void printStartFlightInfo() {
        System.out.println("Choose operation: ");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
        System.out.print("> ");
    }
    
    public void AirportPanel() {
        String action;
        
        System.out.println("Airport panel\n-------------------------");
        
        while(true) {
            printStartAirportInfo();
            action = sc.nextLine();
            
            if(action.equals("x")) {
                break;
            }
            if(action.equals("1")) {
                System.out.print("Give plane ID: ");
                String planeID = sc.nextLine();
                System.out.print("Give plane capacity: ");
                int capacity = sc.nextInt();
                airport.addPlane(planeID, capacity);
            }
            else if(action.equals("2")) {
                System.out.print("Give plane ID: ");
                String planeID = sc.nextLine();
                System.out.print("Give departure airport code: ");
                String departure = sc.nextLine();
                System.out.print("Give destination airport code: ");
                String destination = sc.nextLine();
                airport.addFlight(planeID, departure, destination);
            }
            
        }
    }
    
    public void FlightService() {
        String action;
        System.out.println("Flight service\n--------------------------");
    
        while(true) {
            printStartFlightInfo();
            action = sc.nextLine();
            
            if(action.equals("x")) {
                break;
            }
            if(action.equals("1")) {
                airport.printPlanes();
            }
            else if(action.equals("2")) {
                airport.printFlightRecord();
            }
            else if(action.equals("3")) {
                System.out.print("Give plane ID: ");
                String planeID = sc.nextLine();
                
                airport.printPlaneRecord(planeID);
            }
            
        }
    
    
    }
}
