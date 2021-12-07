/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author asus
 */
public class Lingkaran extends BangunDatar {
    
    // this is attribute of fingers
    public double fingers;
     
    // this is method to calculate the area 
    public double calculateTheArea(){
        double area = Math.PI * fingers * fingers;
        return area;
    }
    
    // this is method to calculate the circumference
    public double calculateTheCircumference(){
        double circumference = 2 * Math.PI * fingers;
        return circumference;
    }
}