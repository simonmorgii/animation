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
public class BewegungHorizontal extends BewegungsBasis {
    public BewegungHorizontal(int startX, int startY, int frameBreite, int frameHoehe){
        super(startX, startY, frameBreite, frameHoehe);
    }
    @Override
    public void bewege(){
         if(pixX >= maxBreite){
          pixX = 10;
        }
        int changeX = maxBreite / 500;
        pixX += changeX;        
    }
}
