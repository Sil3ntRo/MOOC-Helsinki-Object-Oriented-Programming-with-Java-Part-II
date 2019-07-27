/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rohan
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> ownerList;
    
    public VehicleRegister() {
        this.ownerList = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner) {
        if(!this.ownerList.containsKey(plate)) {
            this.ownerList.put(plate, owner);
            return true;
        }
        else {
            return false;
        }
    }
    
    public String get(RegistrationPlate plate) {
        return this.ownerList.get(plate);
    }
    
    public boolean delete(RegistrationPlate plate) {
        if(!this.ownerList.containsKey(plate)) {
            return false;
        }
        this.ownerList.remove(plate);
        return true;
    }
    
    public void printRegistrationPlates() {
        for(Map.Entry<RegistrationPlate, String> entry : this.ownerList.entrySet()) {
            RegistrationPlate key = entry.getKey();
            System.out.println(key);
        }
    }
    
    public void printOwners() {
        ArrayList<String> ownersPrint = new ArrayList<String>();
        
        for(Map.Entry<RegistrationPlate, String> entry : this.ownerList.entrySet()) {
            String value = entry.getValue();
            if(!ownersPrint.contains(value)) {
                ownersPrint.add(value);
            }
        }
        
        for(String owner : ownersPrint) {
            System.out.println(owner);
        }
    }
}
