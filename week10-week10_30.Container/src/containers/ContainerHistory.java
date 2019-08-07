/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author Rohan
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContainerHistory {
    private List<Double> productHistory;
    
    public ContainerHistory() {
        this.productHistory = new ArrayList<Double>();
    }
    
    public void add(double situation) {
        productHistory.add(situation);
    }
    
    public void reset() {
        productHistory.clear();
    }
    
    public double maxValue() {
        if(productHistory.isEmpty()) {
            return 0;
        }
        
        return Collections.max(productHistory);
    }
    
    public double minValue() {
        if(productHistory.isEmpty()) {
            return 0;
        }
        
        return Collections.min(productHistory);
    }
    
    public double average() {
        double total = 0;
        
        if(productHistory.isEmpty()) {
            return 0;
        }
        
        for(Double val : productHistory) {
            total += val;
        }
        
        return total / productHistory.size();
    }
    
    public double greatestFluctuation() {
        if(productHistory.size() <= 1 || productHistory.isEmpty()) {
            return 0;
        }
        
        double fluctuation = 0;
        
        for(int i = 1; i < productHistory.size(); i++) {
            double diff = Math.abs(productHistory.get(i) - productHistory.get(i-1));
            
            if(diff > fluctuation) {
                fluctuation = diff;
            }
            
        }
        return fluctuation;
    }
    
    public double variance() {
        if(productHistory.size() <= 1 || productHistory.isEmpty()) {
            return 0;
        }
        
        double avg = average();
        double variance = 0;
        
        for(Double val : productHistory) {
            variance += Math.pow((val - avg), 2);
        }
        
        variance /= (productHistory.size()-1);
        
        return variance;
    }   
    
    @Override
    public String toString() {
        return productHistory.toString();
    }
}
