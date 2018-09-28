/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animation;

import java.awt.Point;

/**
 *
 * @author Name
 */
public class BewegungsBasis {
    protected int pixX;
    protected int pixY;
    int maxBreite;
    int maxHoehe;
    public BewegungsBasis(int startX, int startY, int frameBreite, int frameHoehe){
        pixX = startX;
        pixY = startY;
        maxBreite = frameBreite;
        maxHoehe = frameHoehe;
    }
    public void bewege(){
        if(pixX >= maxBreite || pixY >= maxHoehe){
          pixX = 10;
          pixY = 10;
        }
            int changeX = maxBreite / 500;
            int changeY = maxHoehe / 500;
            pixX += changeX;
            pixY += changeY;
    }
    public Point getPosition(){
        Point position = new Point(pixX, pixY);
        return position;
    }

}
