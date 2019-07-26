import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
           // Write your main program here. Implementing your own classes will be useful.
           Scanner sc = new Scanner(System.in);
           Airport testAirport = new Airport();
           TextUserInterface test = new TextUserInterface(sc, testAirport);
           
           test.AirportPanel();
           test.FlightService();
    
    }
}
