/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author asus
 */
public class project1 {
    int sisi;
	double LuasLingkaran(){
            Lingkaran A =new Lingkaran();	
            A.diameter = Double.valueOf(this.sisi);
            double totalLuas = A.hitungLuas()*2;
            return totalLuas;
	}
        int LuasPersegi(){
            Persegi B = new Persegi();
            B.s = this.sisi;
            return B.hitungLuas();
	}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        project1 C = new project1();
            C.sisi = 42;
            System.out.println("Total Luas bangun pada project 1 adalah  : "+(C.LuasLingkaran()+C.LuasPersegi())+" cmÂ²");
        project2 D = new project2();
            D.panjang=28;
            D.lebar = 14;
            System.out.println("Total Luas bangun pada project 2 adalah  : "+(D.LuasLingkaran1()-D.LuasLingkaran2())+" cmÂ²");
	}	

    }

