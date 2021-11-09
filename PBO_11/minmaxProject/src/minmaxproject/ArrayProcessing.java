/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minmaxproject;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class ArrayProcessing {
     int [] dataBil = new int[100];
    int a,b,c;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Input data : ");
        this.a = input.nextInt();
            for(b = 0; b < a; b++){
                System.out.println("Masukan bil ke - " + (b+1)+ " : ");
                this.dataBil[b] = input.nextInt();
            }
    }
    double hitungRerata(int[] dataArray){
        double sum = 0;
        for(b=0;b<this.a;b++){
            sum += dataArray[b];
        }
        double rerata = sum/this.a;
        return rerata;
    }
    int cariMax(int[] dataArray){
        int max = dataArray[0];
        for( b=0;b<this.a;b++){
            if (max<dataArray[b]){
                max = dataArray[b];
            }
        }
        return max;
    }
    int cariMin(int[] dataArray){
        int min = dataArray[0];
        for(b=0;b<this.a;b++){
            if (min>dataArray[b]){
                min = dataArray[b];
            }
        }
        return min;
    }
   
    void output(){
    System.out.println("Rata-rata      : " + this.hitungRerata(this.dataBil));
    System.out.println("Nilai minimum  : " + this.cariMin(this.dataBil));
    System.out.println("Nilai maximum  : " + this.cariMax(this.dataBil));
    }      
}
