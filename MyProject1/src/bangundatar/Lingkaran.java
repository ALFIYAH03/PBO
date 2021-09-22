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
public class Lingkaran {
    //atribut
    public int r;
    public String nama;
    // methods
    public void hitungLuas(){
        double hasil = 3.14*r*r;
        System.out.println("Hasil Luas Lingkaran "+nama+" : " + hasil);
    }
    
    public void hitungKeliling(){
        double hasil = 2*3.14*r;
        System.out.println("Hasil Keliling Lingkaran "+nama+" : " + hasil);
    }
}
