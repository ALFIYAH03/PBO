/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagoras;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Pythagoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                System.out.println("  PYTHAGORAS CHECK     ");
        System.out.println("=======================================");
        System.out.println("_______________________________________");        
        System.out.println("Menu Aplikasi Java Pythagoras");
        System.out.println("1.	Cek sisi pythagoras");
        System.out.println("2.	Menentukan sisi miring segitiga");
        System.out.println("3.	Menentukan sisi siku-siku segitiga");
        System.out.println("4.	Exit");
        System.out.println("_______________________________________");  
        System.out.println("Masukan Nomor Pilihan Anda : ");
        Scanner pilihan = new Scanner(System.in);
        
        switch(pilihan.nextInt()){
            case 1 :
                Menu t = new Menu();
                t.input();
                t.cek();
                break;
            case 2 :
                SisiMiring c = new SisiMiring();
                c.input();
                c.sisiMiring();
                break;
            case 3 :
                SisiSiku siku = new SisiSiku();
                siku.input();
                siku.sisiSiku();
                break;
            case 4:
                System.out.println("--Program Selesai--");
  
                // Terminate JVM
                System.exit(0);
            default :
                System.out.println("Pilihan tidak tersedia");
                
        }      
    }          
}
