/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

/**
 *
 * @author Rohan
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {
    private File file;
    
    public WordInspection(File file) {
        this.file = file;
    }
    
    public int wordCount() throws FileNotFoundException {
        int count = 0;
        
        Scanner sc = new Scanner(file, "UTF-8");
        
        while(sc.hasNext()) {
            sc.next();
            count++;
        }
        return count;
    }
    
    public List<String> wordsContainingZ() throws FileNotFoundException {
        List<String> containZ = new ArrayList<String>();
        Scanner sc = new Scanner(file, "UTF-8");
        
        while(sc.hasNext()) {
            String zWord = sc.next();
            
            if(zWord.contains("z")) {
                containZ.add(zWord);
            }
        }
        
        return containZ;
    }
    
    public List<String> wordsEndingInL() throws FileNotFoundException {
        List<String> endsListL = new ArrayList<String>();
        Scanner sc = new Scanner(file, "UTF-8");
        
        while(sc.hasNext()) {
            String lWord = sc.next();
            
            if(lWord.endsWith("l")) {
                endsListL.add(lWord);
            }
        }
        return endsListL;
        
    }
    
    public List<String> palindromes() throws FileNotFoundException {
        List<String> palindrome = new ArrayList<String>();
        Scanner sc = new Scanner(file, "UTF-8");
        
        while(sc.hasNext()) {
            String palin = sc.next();
            int front = 0;
            int back = palin.length()-1;
            boolean isPalindrome = true;
            
            while(front < back) {
                if(palin.charAt(front) != palin.charAt(back )) {
                    isPalindrome = false;
                    break;
                }
                front++;
                back--;
            }
            if(isPalindrome) {
                palindrome.add(palin);
            }
        }
        return palindrome;
    }
    
    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException {
        List<String> vowelList = new ArrayList<String>();
        char[] vowels = "aeiouyäö".toCharArray();
        
        Scanner sc = new Scanner(file, "UTF-8");
        
        while(sc.hasNext()) {
            String word = sc.next();
            
            boolean containsVowels = true;
            for(char vowel : vowels) {
                if(!word.contains("" + vowel)) {
                    containsVowels = false;
                    break;
                }
            }
            
            if(containsVowels) {
                vowelList.add(word);
            }
        }
        return vowelList;
    }
}
