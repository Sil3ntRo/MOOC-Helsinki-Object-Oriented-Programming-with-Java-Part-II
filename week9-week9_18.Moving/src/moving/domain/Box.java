/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author Rohan
 */
import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {
    private int maximumCapacity;
    private List<Thing> box;
    
    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        box = new ArrayList<Thing>();
    }
    
    public int getMaximumCapacity() {
        return maximumCapacity;
    }
    
    @Override
    public int getVolume() {
        int capacityValue = 0;
        for(Thing each : box) {
            capacityValue += each.getVolume();
        }
        return capacityValue;
    }
    
    public boolean addThing(Thing thing) {
        if(this.getVolume() + thing.getVolume() > maximumCapacity) {
            return false;
        }
        if(this.getVolume() + thing.getVolume() <= maximumCapacity) {
            box.add(thing);
        }
        return true;
    }
}
