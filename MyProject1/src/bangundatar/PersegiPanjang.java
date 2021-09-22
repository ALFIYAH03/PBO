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
public class PersegiPanjang {
    //atribut
    public int panjang;
    public int lebar;
    //methods
    public void hitungLuas(){
        int luas = panjang * lebar;
        System.out.println("Hasil Luas Persegi Panjang: " + luas);
    }
    public void hitungKeliling(){
        int keliling = 2*(panjang + lebar);
        System.out.println("Hasil Keliling Persegi Panjang: " + keliling);
    }
   }

