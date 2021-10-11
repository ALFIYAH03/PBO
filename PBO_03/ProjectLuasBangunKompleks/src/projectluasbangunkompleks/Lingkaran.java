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
public class Lingkaran {
    double diameter;
    double hitungLuas(){
	double r= this.diameter / 2 ;
			
	double phi = 3.14;
	double Luas = (phi * (r*r));
	return Luas;
	}
}
