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
public class PersegiPanjang extends BangunDatar {
    
    // this is attribute of length and width
    public double length, width;
    
    // this is method to calculate the area
    public double calculateTheArea(){
        double area = length * width;
        return area;
    }
    
    // this is method to calculate the circumference
    public double calculateTheCircumference(){
        double circumference = 2 * (length + width);
        return circumference;
    }
}