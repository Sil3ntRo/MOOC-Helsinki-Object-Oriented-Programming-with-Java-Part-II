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


public class Circle extends Figure {
    private int diameter;
    
    public Circle(int x, int y, int diameter) {
        super(x,y);
        this.diameter = diameter;
    }
    
    @Override
    public void draw(Graphics graphic) {
        graphic.fillOval(this.getX(), this.getY(), diameter, diameter);
    }
}
