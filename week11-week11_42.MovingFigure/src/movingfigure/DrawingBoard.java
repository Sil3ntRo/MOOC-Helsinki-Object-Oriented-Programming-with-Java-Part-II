/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

/**
 *
 * @author Rohan
 */
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {
    private Figure figure;
    
    public DrawingBoard(Figure fig) {
        this.figure = fig;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.figure.draw(g);
    }
}
