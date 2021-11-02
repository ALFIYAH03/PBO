/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangka;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class GameTebakAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int  a ;
        Acak rn = new Acak();
        int acak = rn.generate();
        System.out.println();
        
        System.out.println("Hai.. nama saya Mr. Java, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!");
        Scanner masukan = new Scanner(System.in);

        do{
            System.out.println("Masukan tebakan anda: ");
            a = masukan.nextInt();
            
            if(a < acak){
                System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");
                
            } else if(a > acak){
                System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");
                
            } else {
                System.out.println("Yeeee… Bilangan tebakan anda BENAR :-)");
                break;
            }
        } while (a != acak);
        
    }
    }
  