/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animation;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Name
 */
public class CustomMouseListener implements MouseListener{
    private Point position;
    @Override
    public void mouseReleased(MouseEvent e) {
        position = new Point(e.getX(), e.getY());
    }   
    public Point getPosition(){
        return position;
    }
    // unused //
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }    
}
