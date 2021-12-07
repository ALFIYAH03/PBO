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
public class Tabung extends BangunRuang {
    
    // this is attribute of fingers and height
    public double fingers, height;
    
    // this is method to calculate volume 
    public double calculateVolume(){
        double volume = Math.PI * Math.pow(fingers,2) * height;
        return volume;
    }
    
    // this is method to calculate surface area
    public double calculateSurfaceArea(){
        double surfaceArea = Math.PI * fingers * (fingers + (2 * height));
        return surfaceArea;
    }
}