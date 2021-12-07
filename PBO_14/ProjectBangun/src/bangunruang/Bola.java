/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author asus
 */
public class Bola extends BangunRuang {
    
    // this is attribute of fingers
    public double fingers;
    
    // this is method to calculate volume 
    public double calculateVolume(){
        double volume = (4 * Math.PI * Math.pow(fingers, 3))/ 3;
        return volume;
    }
    
    // this is method to calculate surface area
    public double calculateSurfaceArea(){
        double surfaceArea = 4 * Math.PI * Math.pow(fingers, 2);
        return surfaceArea;
    }
}