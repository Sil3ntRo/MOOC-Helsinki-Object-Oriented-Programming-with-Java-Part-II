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

public class ClickPlus implements ActionListener {
    private JTextField input;
    private JTextField output;
    private JButton zButton;
    
    public ClickPlus(JTextField input, JTextField output, JButton zButton) {
        this.input = input;
        this.output = output;
        this.zButton = zButton;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int out = 0;
        int in = 0;
        
        try {
            in = Integer.parseInt(input.getText());
            out = Integer.parseInt(output.getText());
            
            out += in;
            
            this.input.setText("");
            this.output.setText("" + out);
            
            if(Integer.parseInt(this.output.getText()) == 0) {
                zButton.setEnabled(false);
            }
            else {
                zButton.setEnabled(true);
            }
        } catch(NumberFormatException ne) {
            this.input.setText("");
        } 
        
    }
}
