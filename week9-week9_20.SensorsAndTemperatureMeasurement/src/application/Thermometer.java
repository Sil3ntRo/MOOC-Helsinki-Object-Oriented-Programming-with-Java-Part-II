/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import application.ConstantSensor;

import java.util.Random;
/**
 *
 * @author Rohan
 */
public class Thermometer implements Sensor {
    
    private boolean on;
    
    public Thermometer() {
        this.on = false;
    }
    
    @Override
    public boolean isOn() {
        return on;
    }
    
    @Override
    public void on() {
        on = true;
    }
    
     @Override
    public void off() {
        on = false;
    }
    
    @Override
    public int measure() {
        Random rand = new Random();
        
        if(on) {
            return rand.nextInt(61) - 30;
        } 
        else {
            throw new IllegalStateException();
            
        }
    }
}
