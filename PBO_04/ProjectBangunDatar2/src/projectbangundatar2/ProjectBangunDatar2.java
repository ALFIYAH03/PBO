/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author asus
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Integer data types will be handled with the same method as double
        
        //Persegi Panjang
        System.out.println("Hasil hitung Persegi Panjang :");
        PersegiPanjang a = new PersegiPanjang();
        System.out.println("a. Luas     : " + a.hitungLuas(7,5));
        System.out.println("   Keliling : " + a.hitungKeliling(7,5));
        System.out.println("b. Luas     : " + a.hitungLuas(3.6,8));
        System.out.println("   Keliling : " + a.hitungKeliling(3.6,8));
        System.out.println("c. Luas     : " + a.hitungLuas(6,8.3));
        System.out.println("   Keliling : " + a.hitungKeliling(6,8.3));
        System.out.println("d. Luas     : " + a.hitungLuas(5.6,8.8));
        System.out.println("   Keliling : " + a.hitungKeliling(5.6,8.8));
        
        //Persegi
        System.out.println();
        System.out.println("Hasil hitung Persegi :");
        Persegi b =  new Persegi();
        System.out.println("a. Luas             : "+ b.hitungLuas(4.5));
        System.out.println("   Keliling         : "+ b.hitungKeliling(4.5));
        System.out.println("b. Luas             : "+ b.hitungLuas(7));
        System.out.println("   keliling         : "+ b.hitungKeliling(7));
        
        //Lingkaran
        System.out.println();
        System.out.println("Hasil hitung Lingkaran :");
        Lingkaran c = new Lingkaran();
        System.out.println("a. Luas           : "+ c.hitungLuas(5));
        System.out.println("   Keliling       : "+ c.hitungKeliling(5));
        System.out.println("b. Luas           : "+ c.hitungLuas(7.4));
        System.out.println("   Keliling       : "+ c.hitungKeliling(7.4));
        
        //Segitiga
        System.out.println();
        System.out.println("Hasil hitung Segitiga :");
        Segitiga d = new Segitiga();
        System.out.println("a. Luas          : "+ d.hitungLuas(8,10));
        System.out.println("   Keliling      : "+ d.hitungKeliling(8,10));
        System.out.println("b. Luas          : "+ d.hitungLuas(8,11.5));
        System.out.println("   Keliling      : "+ d.hitungKeliling(8,11.5));
        System.out.println("c. Luas          : "+ d.hitungLuas(12.2,9));
        System.out.println("   Keliling      : "+ d.hitungKeliling(12.2,9));
        System.out.println("d. Luas          : "+ d.hitungLuas(13.9,20.7));
        System.out.println("   Keliling      : "+ d.hitungKeliling(13.9,20.7));
    }
 }
   
