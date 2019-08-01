/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import application.ConstantSensor;
import application.Thermometer;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Rohan
 */
public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> sensorNum;
    
    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.sensorNum = new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor additional) {
        sensors.add(additional);
    }
    
    @Override
    public boolean isOn() {
        for(Sensor sen : sensors) {
            if(!sen.isOn()) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public void on() {
        for(Sensor sen : sensors) {
            sen.on();
        }
    }
    
    @Override
    public void off() {
        for(Sensor sen : sensors) {
            sen.off();
        }
    }
    
    public List<Integer> readings() {
        return sensorNum;
    }
    
    @Override
    public int measure() {
        int sum = 0;
        int avg;
        
        if(!isOn() || sensors.size() == 0) {
            throw new IllegalStateException();
        }
        
        for(Sensor sen : sensors) {
            sum += sen.measure();
        }
        
        avg = sum / sensors.size();
        sensorNum.add(avg);
        return avg;
    }
    
    
}
