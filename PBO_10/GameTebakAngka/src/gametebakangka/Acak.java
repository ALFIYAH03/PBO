/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangka;

/**
 *
 * @author asus
 */
class Acak {
        int min = 0;
    int max = 100;
    int generate() {
        return min + (int)(Math.random() * ((max - min) + 1));
    }  
}