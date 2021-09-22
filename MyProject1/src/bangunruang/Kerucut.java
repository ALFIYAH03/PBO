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
public class Kerucut {
   //atribut
    public int r;
    public int s;
    public int t;
    //methods
    public void hitungVol(){
        double hasil = 3.14*r*r*t*3;
        System.out.println("Volume Kerucut : "+hasil);
    }
    public void hitungLuasSelimut(){
        double hasil = 3.14*r*s;
        System.out.println("Luas Permukaan Kerucut :"+hasil);
    } 
}
