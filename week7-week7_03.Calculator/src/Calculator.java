/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rohan
 */


public class Calculator {
    private Reader reader;
    private int statistics = 0;
    
    public Calculator() {
        this.reader = new Reader();
    }
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
        
    
    private void sum() {
        int sum;
        int value1, value2;
        System.out.print("value1: ");
        value1 = reader.readInteger();
        
        System.out.print("value2: ");
        value2 = reader.readInteger();
        
        sum = value1 + value2;
        System.out.println("sum of the values " + sum);
        
        statistics++;
    }
    
    private void difference() {
        int diff;
        int value1, value2;
        System.out.print("value1: ");
        value1 = reader.readInteger();
        
        System.out.print("value2: ");
        value2 = reader.readInteger();
        
        diff = value1 - value2;
        
        System.out.println("difference of the values " + diff);
        
        statistics++;
    }
    
    private void product() {
        int product;
        int value1, value2;
        
        System.out.print("value1: ");
        value1 = reader.readInteger();
        
        System.out.print("value2: ");
        value2 = reader.readInteger();
        
        product = value1 * value2;
        
        System.out.println("product of the values " + product);
        
        statistics++;
    }
    
    private void statistics() {
        System.out.println("Calculations done " + statistics);
    }
}
