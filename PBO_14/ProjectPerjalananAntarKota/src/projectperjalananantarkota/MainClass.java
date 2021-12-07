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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sedan sdn   = new Sedan();
        SUV   suv   = new SUV();
        MPV   mpv   = new MPV();
        
        //declaration for array
        String[][] trip = {
            {"A","Sedan","107","60"},
            {"B","Sedan","538","65"},
            {"C","SUV","662","57"},
            {"D","SUV","471","62"},
            {"E","MPV","541","64"},
            {"F","MPV","433","53"}
        };
        
        for (int i=0; i< trip.length; i++){
            if (trip[i][1] == "Sedan"){
                sdn.range = Double.parseDouble(trip[i][2]);
                sdn.speed = Double.parseDouble(trip[i][3]);
                sdn.calculateFuel();
                sdn.calculateTravelTime();
                System.out.println("\n" + trip[i][0]);
                sdn.showResults();      
            }
            
            else if (trip[i][1] == "SUV"){
                suv.range = Double.parseDouble(trip[i][2]);
                suv.speed = Double.parseDouble(trip[i][3]);
                suv.calculateFuel();
                suv.calculateTravelTime();
                System.out.println("\n" + trip[i][0]);
                suv.showResults();      
            }
            
            else if (trip[i][1] == "MPV"){
                mpv.range = Double.parseDouble(trip[i][2]);
                mpv.speed = Double.parseDouble(trip[i][3]);
                mpv.calculateFuel();
                mpv.calculateTravelTime();
                System.out.println("\n" + trip[i][0]);
                mpv.showResults();      
            }
            
            else {
                System.out.println("Type not found");
            }
        }
    }   
}