/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animation;

/**
 *
 * @author Name
 */
public class BewegungsBasis {
    int pixX;
    int pixY;
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
    public int[] getPosition(){
        int[] position = {pixX, pixY};
        return position;
    }

    void addPosition(int i, int i0) {
    }

    int[] getLastPoint() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
