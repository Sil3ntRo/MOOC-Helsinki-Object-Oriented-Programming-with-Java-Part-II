import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.
        Scanner sc = new Scanner(System.in);
        Tournament tournament = new Tournament();
        UserInterface newGame = new UserInterface(sc, tournament);
        newGame.addParticipants();
        newGame.startTournament();
        newGame.tournamentResults();
    }
}
