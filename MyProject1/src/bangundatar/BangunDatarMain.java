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
public class BangunDatarMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 25;
        pp.lebar = 38;
        pp.hitungLuas();
        pp.hitungKeliling();
    
        Persegi A = new Persegi();
        A.sisi = 10;
        A.nama = "A";
        A.hitungLuas();
        A.hitungKeliling();
        
        Persegi B = new Persegi();
        B.sisi = 15;
        B.nama = "B";
        B.hitungLuas();
        B.hitungKeliling();
        
        Lingkaran X = new Lingkaran();
        X.r = 25;
        X.nama = "X";
        X.hitungLuas();
        X.hitungKeliling();
        
        Lingkaran Z = new Lingkaran();
        Z.r = 37;
        Z.nama = "Z";
        Z.hitungLuas();
        Z.hitungKeliling();
    }  
}
