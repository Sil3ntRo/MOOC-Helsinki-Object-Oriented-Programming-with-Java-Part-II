package game;

import gameoflife.Simulator;

public class Main {

    public static void main(String[] args) {
        // test your program here
        PersonalBoard board = new PersonalBoard(100,100);
        board.initiateRandomCells(0.7);
        
        Simulator sim = new Simulator(board);
        sim.simulate();
    }
}
