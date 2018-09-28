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
public class BewegungCustom extends BewegungsBasis {

    public BewegungCustom(int startX, int startY, int frameBreite, int frameHoehe) {
        super(startX, startY, frameBreite, frameHoehe);
        this.positions[0] = new Point(30, 30);
    }
    private Point[] positions = new Point[1];
    int position = 0;
    boolean start = true;

    public void addPosition(Point p) {
        if (p.x != 0 && p.y != 0 && p.x != positions[positions.length - 1].x && p.y != positions[positions.length - 1].y) {
            Point[] newList = new Point[positions.length + 1];
            for (int i = 0; i < positions.length; i++) {
                newList[i] = positions[i];
            }
            newList[positions.length] = p;
            this.positions = newList;
        }
    }

    public Point getLastPoint() {
        return positions[positions.length - 1];
    }

    public void bewege() {
        if (pixX < positions[position].x) {
            pixX++;
        } else {
            pixX--;
        }
        if (pixY < positions[position].y) {
            pixY++;
        } else {
            pixY--;
        }
        if (positions.length > position + 1 && pixX == positions[position].x && pixY == positions[position].y) {
            position++;
        }
    }
}
