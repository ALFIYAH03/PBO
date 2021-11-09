/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingproject;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class arrayProcessing {
     int [] dataBilangan = new int[100];
    int a, b, c;

    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Input Data Di Bawah Ini : ");
        this.a = input.nextInt();
            for(b = 0; b < a; b++){
                System.out.println("Masukan Bil Ke - " + (b+1)+ " : ");
                this.dataBilangan[b] = input.nextInt();
            }
    }
    
    double hitungRatarata(int[] dataArray){
        double sum = 0;
        for(b = 0;b < this.a; b ++){
            sum += dataArray[b];
        }
        double ratarata = sum / this.a;
        return ratarata;
    }
    
    int cariMax(int[] dataArray){
        int max = dataArray[0];
        for(b = 0; b < this.a; b ++){
            if (max < dataArray[b]){
                max = dataArray[b];
            }
        }
        return max;
    }
    
    int cariMin(int[] dataArray){
        int min = dataArray[0];
        for(b = 0; b < this.a; b ++){
            if (min > dataArray[b]){
                min = dataArray[b];
            }
        }
        return min;
    }
    
    int [] urutkan(){
       int[] dataArray = this.dataBilangan;
       for (b = this.a - 1; b >= 0; b--) {
            for (c = 0; c < b; c++) {
                if(dataArray[c] > dataArray[c + 1]){
                    int temp = dataArray[c];
                    dataArray[c] = dataArray[c + 1];
                    dataArray[c + 1] = temp;
                }
            }
        
        }
       
        for(int d = 0; d < d; d ++){
           System.out.println(dataArray[d]);
        }
       return dataArray;
    }
  
    void output(){
    System.out.println("Ratarata        : " + this.hitungRatarata(this.dataBilangan));
    System.out.println("Nilai Minimum   : " + this.cariMin(this.dataBilangan));
    System.out.println("Nilai Maximum   : " + this.cariMax(this.dataBilangan));
    System.out.println("Sorting         : ");
    int [] dataArray;
        dataArray = this.urutkan();
    }
}
