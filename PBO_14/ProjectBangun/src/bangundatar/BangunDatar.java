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
public abstract class BangunDatar {    
    public abstract double calculateTheArea();
    public abstract double calculateTheCircumference();
    public void showResults(){
        System.out.println("The Area is          : " + this.calculateTheArea());
        System.out.println("The Circumference is : " + this.calculateTheCircumference());
    }
}