/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainClass;

import java.io.IOException;
import java.util.Scanner;
import project.karyawan;

/**
 *
 * @author asus
 */
public class DataKaryawan {
    public static void main(String[] args) throws IOException {
        karyawan masukKerja = new karyawan();
        Scanner dyv = new Scanner(System.in);
        String opsi,jawab = "y";   
        while(jawab.equalsIgnoreCase("y") ) {        	
        	   System.out.println("\n\n________________________________________________________________________________________"
                           + "\n                              DATA KARYAWAN PERUSAHAAN"
                           + "\n________________________________________________________________________________________"
                           + "\nMenu Utama : ");
        
	        System.out.println("1. Tambah Data Karyawan");
	        System.out.println("2. Hapus Data Karyawan");	
	        System.out.println("3. Cari Data Karyawan");
	        System.out.println("4. Lihat Data Karyawan ");
	        System.out.println("5. Exit");	        
	    
	        System.out.println("\nPilih Menu Pilihan Anda : ");
	        opsi = dyv.nextLine();
	        
            switch (opsi) {
                case "1":
                    System.out.println("\n________________________________________________________________________________________");
                    masukKerja.Add();
                    break;
                case "2":
                    System.out.println("\n________________________________________________________________________________________");
                    masukKerja.Delete();
                    break;
                case "3":
                    System.out.println("\n________________________________________________________________________________________");
                    masukKerja.Search();
                    break;
                case "4":
                    System.out.println("\n________________________________________________________________________________________");
                    masukKerja.View();
                    break;
                case "5":
                    System.exit(0);
                default:	
                    break;
            }
		        	
	        System.out.println("\n----------------------------------------------------------------------------------------------"
                        + "\nApakah Anda ingin tetap melanjutkan sistem ini ?"
                        + "\nY = Ya\nT = Tidak");
	        jawab = dyv.nextLine();
        }
    }
}
