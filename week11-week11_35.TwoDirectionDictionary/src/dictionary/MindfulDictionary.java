/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author Rohan
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class MindfulDictionary {
    private Map<String, String> finnToEng;
    private Map<String, String> engToFinn;
    private File file;
    
    public MindfulDictionary() {
        this.finnToEng = new HashMap<String, String>();
        this.engToFinn = new HashMap<String, String>();
    }
    
    public MindfulDictionary(String file) throws FileNotFoundException {
        this();
        this.file = new File(file);
    }
    
    public boolean load() {
        try {
            Scanner sc = new Scanner(file);
            
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] words = line.split(":");
                add(words[0], words[1]);
            }
                    
        } catch(Exception e) {
            return false;
        }
        
        return true;
    }
    
    public boolean save() {
        try {
            FileWriter fw = new FileWriter(file);
            
            for(String word : finnToEng.keySet()) {
                fw.write(word + ":" + finnToEng.get(word) + "\n");
            }
            fw.close();
        }catch(Exception e) {
            return false;
        }
        
        return true;
    }
    
    public void add(String word, String translation) {
        if(!finnToEng.containsKey(word)) {
             finnToEng.put(word, translation);
             engToFinn.put(translation, word);
        }
    }
    
    public String translate(String word) {
        if(finnToEng.containsKey(word)) {
            return finnToEng.get(word);
        }
        if(engToFinn.containsKey(word)) {
            return engToFinn.get(word);
        }
        
        return null;
    }
    
    public void remove(String word) {
        if(finnToEng.containsKey(word)) {
            String translation = finnToEng.get(word);
            finnToEng.remove(word);
            engToFinn.remove(translation);
        }
        
        if(engToFinn.containsKey(word)) {
            String translation = engToFinn.get(word);
            engToFinn.remove(word);
            finnToEng.remove(translation);
            
        }
        
    }
}
