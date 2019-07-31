/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rohan
 */
import java.util.*;

public class Tournament {
    private List<Participant> game;
    private int round;
    Random rand;
    
    public Tournament() {
        this.game = new ArrayList<Participant>();
        rand = new Random();
    }
    
    public void addParticipant(String name) {
        this.game.add(new Participant(name));
    }
    
    public void startRound() {
        System.out.println("\nRound " + ++round);
        printStats();
        System.out.println("\nResults of round " + round);
        
        for(Participant each : this.game) {
            int length = rand.nextInt((120 - 60) + 1) + 60;
            
            each.addJump(length);
            int[] votes = generatePoint();
            System.out.println("  " + each.getName());
            System.out.println("    length: " + length);
            System.out.print("    judge votes: [");
            
            printVotes(votes);
            each.addPoints(calculateSumVotes(votes) + length);
        }
        
    }
    
    public int[] generatePoint() {
        int[] judgePanel = new int[5];
        for(int i = 0; i < judgePanel.length; i++) {
            int randNum = rand.nextInt((20 - 10) + 1) + 10;
            judgePanel[i] = randNum;
        }
        return judgePanel;
    }
    
    public int calculateSumVotes(int[] votes) {
        int sum = 0;
        Arrays.sort(votes);
        
        for(int i = 1; i < votes.length-1; i++) {
            sum += votes[i];
        }
        return sum;
    }
    
    public void printVotes(int[] votes) {
        for(int i = 0; i < votes.length-1; i++) {
            System.out.print(votes[i] + ", ");
        }
        System.out.print(votes[votes.length-1] + "]\n");
    }
    
    public void printStats() {
        int participantNum = 0;
        Collections.sort(game);
        System.out.println("\nJumping order: ");
        for(Participant each : game) {
            System.out.println("  " + ++participantNum + ". " + each);
        }
    }
    
    public void printTournamentResults() {
        int position = 0;
        System.out.println("\nThanks!\n\nTournament results:");
        System.out.println("Position    Name");
        Collections.sort(game);
        Collections.reverse(game);
        for(Participant person : game) {
            System.out.println(++position + "           " + person);
            System.out.print("            jump lengths: ");
            person.printJumps();
        }
    }
}
