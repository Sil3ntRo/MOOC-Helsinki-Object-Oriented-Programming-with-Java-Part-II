/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rohan
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    private Map<String, Integer> productPrice;
    private Map<String, Integer> productStock;
    
    public Storehouse() {
        this.productPrice = new HashMap<String, Integer>();
        this.productStock = new HashMap<String, Integer>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.productPrice.put(product, price);
        this.productStock.put(product, stock);
    }
    
    public int price(String product) {
        if(!this.productPrice.containsKey(product)) {
            return -99;
        }
        return this.productPrice.get(product);
    }
    
    public int stock(String product) {
        int value = 0;
        for(String key : this.productStock.keySet()) {
            if(product.equals(key)) {
                value = this.productStock.get(key);
            }
        }
        return value;
    }
    
    public boolean take(String product) {
        boolean status = false;
        
        for(String key : this.productStock.keySet()) {
            if(product.equals(key) && this.stock(product) > 0) {
                this.productStock.put(product, this.productStock.get(product)-1);
                status = true;
            }
        }
        return status;
    }
    
    public Set<String> products() {
        Set<String> product = new HashSet<String>();
        
        for(Map.Entry<String, Integer> inventory : this.productStock.entrySet()) {
           product.add(inventory.getKey());
        }
        
        return product;
    }
}
