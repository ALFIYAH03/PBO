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
public class Persegi extends BangunDatar {
    
    // this is attribute of side
    public double side;
    
    // this is method to calculate the area
    public double calculateTheArea(){
        double area = this.side * this.side;
        return area;
    }
    
    // this is method to calculate the circumference
    public double calculateTheCircumference(){
        double circumference = 4 * this.side;
        return circumference;
    }
}