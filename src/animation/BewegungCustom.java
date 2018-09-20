/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animation;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Name
 */
public class BewegungCustom extends BewegungsBasis{
    public BewegungCustom(int startX, int startY, int frameBreite, int frameHoehe){
        super(startX, startY, frameBreite, frameHoehe);
        this.positions[0][0] = 50;
        this.positions[0][1] = 40;
    }
    private int[][] positions= new int[1][2];    
    @Override
    public void addPosition(int x, int y){
        int[][] newArray = new int[positions.length + 1][2];
        for (int i = 0; i < newArray[0].length - 1; i++) {
            newArray[i][0] = positions[i][0];
            newArray[i][1] = positions[i][1];
        }
        newArray[newArray.length - 1][0] = x;
        newArray[newArray.length - 1][1] = y;
        this.positions = newArray;
        System.out.println(this.positions[1][0]);
        System.out.println(this.positions[1][0]);
    }
    @Override
    public int[] getLastPoint(){
        int[] lastPoint = new int[2];
        lastPoint[0] = positions[positions.length - 1][0];
        lastPoint[1] = positions[positions.length - 1][1];
        return lastPoint;
    }
    public void bewege(){
        if(pixX < positions[0][0]){
            pixX++;
        } else {
            pixX--;
        }
        if (pixY < positions[0][1]) {
            pixY++;
        } else {
            pixY--;
        }
        if (positions.length < 1) {
            removeActualPoint();
        }
    }
    private void removeActualPoint(){
        System.out.println("remove");
        int[][] newArray = new int[positions.length - 1][2];
        for (int i = 0; i < newArray[0].length; i++) {
            newArray[i][0] = positions[i + 1][0];
            newArray[i][1] = positions[i + 1][1];
        }
        this.positions = newArray;
    }
}
