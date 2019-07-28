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

public class ShoppingBasket {
    private Map<String, Purchase> basket;
    
    public ShoppingBasket() {
        this.basket = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price) {
        if(this.basket.containsKey(product)) {
            for(Map.Entry<String, Purchase> key : this.basket.entrySet()) {
                if(product.equals(key.getKey())) {
                    Purchase match = key.getValue();
                    match.increaseAmount();
                    this.basket.put(product, match);
                }
            }
        }
        else {
            this.basket.put(product, new Purchase(product, price));
        }
    }
    
    public int price() {
        int price = 0;
        for(Map.Entry<String, Purchase> key : this.basket.entrySet()) {
            Purchase eachPrice = key.getValue();
            price += eachPrice.price();
        }
        return price;
    }
    
    public void print() {
        for(Map.Entry<String, Purchase> key : this.basket.entrySet()) {
            Purchase eachItem = key.getValue();
            System.out.println(eachItem);
        }
    }
}
