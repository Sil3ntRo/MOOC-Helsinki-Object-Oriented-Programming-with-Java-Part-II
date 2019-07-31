/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rohan
 */
import java.util.Scanner;

public class UserInterface {
    private Scanner sc;
    private Tournament tournament;
    
    public UserInterface(Scanner sc, Tournament tournament) {
        this.sc = sc;
        this.tournament = tournament;
    }
    
    public void addParticipants() {
        System.out.println("Kumpula ski jumping week\n\nWrite the names of the participants" +  
                " one at a time; an empty string brings you to the jumping phase.");
        
        while(true) {
            String answer;
            System.out.print("  Participant name: ");
            answer = sc.nextLine();
            
            if(answer.equals("")) {
                break;
            }
            tournament.addParticipant(answer);
        }
    }
    
    public void startTournament() {
        System.out.println("\nThe tournament begins!");
        while(true) {
            System.out.print("\nWrite \"jump\" to jump; otherwise you quit: ");
            String answer;
            answer = sc.nextLine();
            if(!answer.equals("jump")) {
                break;
            }
            tournament.startRound();
        }
    }
    
    public void tournamentResults() {
        tournament.printTournamentResults();
    }
}

