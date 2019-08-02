/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rohan
 */

import java.io.File;
import java.util.Scanner;

public class Printer {
    private File file;
    
    public Printer(String fileName) throws Exception {
        this.file = new File(fileName);
    }
    
    public void printLinesWhichContain(String word) throws Exception {
        Scanner sc = new Scanner(file, "UTF-8");
        
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            
            if(line.contains(word)) {
                System.out.println(line);
            }
        }
    }
}
