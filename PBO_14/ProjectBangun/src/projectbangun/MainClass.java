/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangun;
import bangundatar.*;
import bangunruang.*;

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
    
        Persegi persegi     = new Persegi();
        Lingkaran lingkaran = new Lingkaran();
        PersegiPanjang pp   = new PersegiPanjang();
        
        Tabung tabung       = new Tabung();
        Balok balok         = new Balok();
        Bola bola           = new Bola();
        
        //Persegi
        persegi.side = 25;
        System.out.println("\nPersegi with side " + persegi.side);
        persegi.calculateTheArea();
        persegi.calculateTheCircumference();
        persegi.showResults();
        
        //Lingkaran
        lingkaran.fingers = 10;
        System.out.println("\nLingkaran with fingers " + lingkaran.fingers);
        lingkaran.calculateTheArea();
        lingkaran.calculateTheCircumference();
        lingkaran.showResults();
        
        //Persegi Panjang
        pp.length = 10;
        pp.width = 5;
        System.out.println("\nPersegi Panjang with length " + pp.length + ", and width " + pp.width);
        pp.calculateTheArea();
        pp.calculateTheCircumference();
        pp.showResults();
        
        //Tabung
        tabung.fingers = 10;
        tabung.height = 15;
        System.out.println("\nTabung with fingers " + tabung.fingers + ", and height " + tabung.height);
        tabung.calculateVolume();
        tabung.calculateSurfaceArea();
        tabung.showResults();
        
        //Balok
        balok.length = 10;
        balok.width = 5;
        balok.height = 7;
        System.out.println("\nBalok with length " + balok.length + ", width " + balok.width + ", and height " + balok.height);
        balok.calculateVolume();
        balok.calculateSurfaceArea();
        balok.showResults();
        
        //Bola
        bola.fingers = 10;
        System.out.println("\nBola with fingers " + bola.fingers);
        bola.calculateVolume();
        bola.calculateSurfaceArea();
        bola.showResults();     
    }
}