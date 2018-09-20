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
public class BewegungVertikal extends BewegungsBasis {
    public BewegungVertikal(int startX, int startY, int frameBreite, int frameHoehe){
        super(startX, startY, frameBreite, frameHoehe);
    }
    @Override
    public void bewege(){
         if(pixY >= maxHoehe){
          pixY = 10;
        }
        int changeY = maxHoehe / 500;
        pixY += changeY;
    }
}
