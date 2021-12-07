/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perjalananantarkota;

/**
 *
 * @author asus
 */
public abstract class Mobil {    
    public abstract double calculateFuel();
    public abstract double calculateTravelTime();
    public void showResults(){
        System.out.println("Fuel Estimate : " + this.calculateFuel());
        System.out.println("Travel Time   : " + this.calculateTravelTime());
    }
}