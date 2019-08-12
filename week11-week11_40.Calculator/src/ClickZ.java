/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rohan
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;


public class ClickZ implements ActionListener {
    private JTextField input;
    private JTextField output;
    private JButton zButton;
    
    public ClickZ(JTextField input, JTextField output, JButton zButton) {
        this.input = input;
        this.output = output;
        this.zButton = zButton;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.input.setText("");
        this.output.setText("0");
        zButton.setEnabled(false);
        
    }
}
