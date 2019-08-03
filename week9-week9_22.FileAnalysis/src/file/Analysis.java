/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

/**
 *
 * @author Rohan
 */
import java.io.File;
import java.util.Scanner;

public class Analysis {
    private File file;
    
    public Analysis(File file) {
        this.file = file;
    }
    
    public int lines() {
        Scanner sc = null;
        
        try {
            sc = new Scanner(file, "UTF-8");
        }catch(Exception e) {
            System.out.println("File is not found " + e.getMessage());
        }
        int lineCount = 0;
        
        while(sc.hasNextLine()) {
            lineCount++;
            sc.nextLine();
        }
        sc.close();
        return lineCount;
    }
    
    public int characters() {
        int characterCount = 0;
        Scanner sc = null;
        
        try {
            sc = new Scanner(file, "UTF-8");
        }catch(Exception e) {
            System.out.println("File is not found " + e.getMessage());
        }
        
        while(sc.hasNextLine()) {
            String line = sc.nextLine()+1;
            characterCount += line.length();
        }
        
        return characterCount;
    }
}
