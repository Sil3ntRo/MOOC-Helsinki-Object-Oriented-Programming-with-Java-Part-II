/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

/**
 *
 * @author Rohan
 */
import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> uniqueWord;
    private int duplicate;
    
    public PersonalDuplicateRemover() {
        this.uniqueWord = new HashSet<String>();
        this.duplicate = 0;
    }
    
    @Override
    public void add(String characterString) {
        if(uniqueWord.contains(characterString)) {
            duplicate++;
        }
        else {
            uniqueWord.add(characterString);
        }
    }
    
    @Override
    public int getNumberOfDetectedDuplicates() {
        return duplicate;
    }
    
    @Override
    public Set<String> getUniqueCharacterStrings() {
        return uniqueWord;
    }
    
    @Override
    public void empty() {
        uniqueWord.clear();
        duplicate = 0;
    }
}
