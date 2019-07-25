/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rohan
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
        
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dict;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dict = dictionary;
    }
    
    public void start() {
        String command;
        
        System.out.println("Statement:");
        System.out.println("\tadd - adds a word pair to the dictionary");
        System.out.println("\ttranslate - asks a word and prints its translation");
        System.out.println("\tquit - quit the text user interface");
        
        System.out.println();
        //System.out.print("Statement: ");
    
    
        while(true) {
            System.out.print("Statement: ");
            command = reader.nextLine();
            
            
            if(command.equals("help")) {
                System.out.println("Unknown statement");
            }
            
            else if(command.equals("translate")) {
                System.out.print("Give a word: ");
                String word = reader.nextLine();
                System.out.println("Translation: " + this.dict.translate(word));
            }
            else if(command.equals("add")) {
                System.out.print("Give a word: ");
                String word = reader.nextLine();
                System.out.print("Translation: ");
                String translation = reader.nextLine();
                this.dict.add(word, translation);
            }
            else if(command.equals("quit")) {
                System.out.println("Cheers!");
                break;
            }
            
        }
    
    
    }
}
