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

public class Dictionary {
    private HashMap<String, String> translations;;
    
    public Dictionary() {
        this.translations = new HashMap<String, String>();
    }
    
    public String translate(String word) {
        if(this.translations.containsKey(word)) {
            return this.translations.get(word);
        }
        return null;
    }
    
    public void add(String word, String translation) {
        this.translations.put(word, translation);
    }
    
    public int amountOfWords() {
       return this.translations.size();
    }
    
    public ArrayList<String> translationList() {
        ArrayList<String> list = new ArrayList<String>();
        
        for(Map.Entry<String, String> entry : this.translations.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            list.add(key + " = " + value);
        }
        return list;
    }
}
