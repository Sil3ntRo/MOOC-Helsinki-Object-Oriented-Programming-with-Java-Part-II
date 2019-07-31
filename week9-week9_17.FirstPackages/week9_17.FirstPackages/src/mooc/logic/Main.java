/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logic;



import mooc.ui.UserInterface;
import mooc.ui.TextUserInterface;
/**
 *
 * @author Rohan
 */
public class Main {
    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        ApplicationLogic app = new ApplicationLogic(ui);
        app.execute(3);
    }
}
