/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rohan
 */
public class CD implements ToBeStored {
    private String artist;
    private String title;
    private int publishingYear;
    private double weight;
    
    public CD(String artist, String title, int year) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = year;
        this.weight = 0.1;
    }
    
    public String getArtist() {
        return this.artist;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int getPublishingYear() {
        return this.publishingYear;
    }
    
    @Override
    public double weight() {
        return this.weight;
    }
    
    public String toString() {
        return getArtist() + ": " + getTitle() + " (" + getPublishingYear() + ")";
    }
}
