/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Rohan
 */
public class ConstantSensor implements Sensor {
    private int sensorNum;
    
    public ConstantSensor(int sensorNum) {
        this.sensorNum = sensorNum;
    }
    
    @Override
    public int measure() {
        return sensorNum;
    }
    
    @Override
    public boolean isOn() {
        return true;
    }
    
    @Override
    public void on() {
        
    }
    
    @Override
    public void off() {
        
    }
    
    
}
