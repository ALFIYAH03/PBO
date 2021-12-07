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
public class MPV extends Mobil {
    
    // this is attribute range and speed
    public double range, speed;
    
    // this method to calculate the fuel
    public double calculateFuel(){
        double fuel = range / 14 ;
        return fuel;
    }
    
    // this is method to calculate travel time
    public double calculateTravelTime(){
        double time = range / speed;
        return time;
    }
}