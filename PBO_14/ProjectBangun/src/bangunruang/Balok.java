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
public class Balok extends BangunRuang {
    
    // this is the attributes of length, width, and height
    public double length, width, height;
    
    // this is method to calculate volume
    public double calculateVolume(){
        double volume = length * width * height;
        return volume;
    }
    
    // this is method to calculate surface area
    public double calculateSurfaceArea(){
        double surfaceArea = 2 * ((length * width) + (length * height) + (height * width));
        return surfaceArea;
    }
}