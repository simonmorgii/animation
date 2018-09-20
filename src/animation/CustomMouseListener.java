/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animation;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Name
 */
public class CustomMouseListener implements MouseListener{
    private int[] position = new int[2];
    @Override
    public void mouseReleased(MouseEvent e) {
        updatePosition(e.getX(), e.getY());
    }
    private void updatePosition(int x, int y) {
        this.position[0] = x;
        this.position[1] = y;
    }
    public int[] getPosition(){
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
