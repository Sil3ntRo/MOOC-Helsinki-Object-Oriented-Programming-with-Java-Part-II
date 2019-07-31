/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logic;

import mooc.ui.UserInterface;

/**
 *
 * @author Rohan
 */
public class ApplicationLogic {
    private UserInterface testUserInterface;
    
    public ApplicationLogic(UserInterface ui) {
        testUserInterface = ui;
    }
    
    public void execute(int howManyTimes) {
        int times = howManyTimes;
        while(times > 0) {
            System.out.println("The application logic works");
            testUserInterface.update();
            times--;
        }
    }
}
