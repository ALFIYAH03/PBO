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
public class Tabung {
    //atribut
    public int r;
    public int t;
    //methods
    public void hitungVol(){
        double hasil = 3.14*r*r*t;
        System.out.println("Volume Tabung :"+hasil);
    }
    public void hitungLuasSelimut(){
        double hasil = 2*3.14*r*(r+t);
        System.out.println("Luas Selimut Tabung :"+hasil);
    }
}
