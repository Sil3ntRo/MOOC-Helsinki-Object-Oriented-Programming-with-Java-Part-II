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

public class Box extends Figure {
    private int width;
    private int height;
    
    public Box(int x, int y, int width, int height) {
        super(x,y);
        this.width = width;
        this.height = height;
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
    
    @Override
    public void draw(Graphics graphic) {
        graphic.fillRect(this.getX(), this.getY(), width, height);
    }
}
