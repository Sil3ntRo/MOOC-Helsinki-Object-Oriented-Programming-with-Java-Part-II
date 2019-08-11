/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

/**
 *
 * @author Rohan
 */
import clicker.applicationlogic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class ClickListener implements ActionListener {
    private JLabel label;
    private Calculator calc;
    
    public ClickListener(Calculator calc, JLabel label) {
        this.label = label;
        this.calc = calc;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.calc.increase();
        this.label.setText(Integer.toString(calc.giveValue()));
    }
}
