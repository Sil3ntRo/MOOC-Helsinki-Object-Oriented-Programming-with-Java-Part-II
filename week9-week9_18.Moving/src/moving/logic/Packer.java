/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

/**
 *
 * @author Rohan
 */
import moving.domain.Box;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {
    int boxVolume;
    
    public Packer(int boxVolume) {
        this.boxVolume = boxVolume;
    }
    
    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<Box>();
        for(Thing each : things) {
            Box box = new Box(boxVolume);
            box.addThing(each);
            boxes.add(box);
        }
        return boxes;
    }
}
