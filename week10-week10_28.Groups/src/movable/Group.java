/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

/**
 *
 * @author Rohan
 */
import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {
    private List<Movable> group;
    
    public Group() {
        this.group = new ArrayList<Movable>();
    }
    
    @Override
    public String toString() {
        String result = "";
        
        for(Movable org : group) {
            result += org.toString() + "\n";
        }
        return result;
    }
    
    public void addToGroup(Movable movable) {
        group.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for(Movable org : group) {
            org.move(dx, dy);
        }
    }
}
