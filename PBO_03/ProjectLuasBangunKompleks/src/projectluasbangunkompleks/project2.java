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
public class project2 {
    double panjang;
	double lebar;
	double LuasLingkaran1(){
            Lingkaran pr2 = new Lingkaran();
            pr2.diameter = Double.valueOf(this.panjang);
            double totalLuas = pr2.hitungLuas()/2;
            return totalLuas;
		}
	double LuasLingkaran2(){
            Lingkaran pr = new Lingkaran();
            pr.diameter = Double.valueOf(this.panjang/2);
            double totalLuas = pr.hitungLuas();
            return totalLuas;
	}
}
