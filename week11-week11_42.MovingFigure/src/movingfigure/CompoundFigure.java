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
import java.util.ArrayList;
import java.util.List;

public class CompoundFigure extends Figure {
    private List<Figure> figure;
    
    public CompoundFigure() {
        super(0,0);
        this.figure = new ArrayList<Figure>();
    }
    
    public void add(Figure f) {
        this.figure.add(f);
    }
    
    @Override
    public void move(int dx, int dy) {
        for(Figure f : figure) {
            f.move(dx, dy);
        }
    }
    
    @Override
    public void draw(Graphics g) {
        for(Figure f : figure) {
            f.draw(g);
        }
    }
}
