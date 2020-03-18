/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication113;

import java.util.Random;

/**
 *
 * @author Asus
 */
public class JavaApplication113 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random rastgele_sayi = new Random();
        int [] rastgele_dizi = new int[100];
        int sayi;
        for(int i = 0; i<10; i++){
            sayi = rastgele_sayi.nextInt(100);
            rastgele_dizi[i] = sayi;
        }
        
        /*for(int i : rastgele_dizi){
            System.out.println(rastgele_dizi[i] +" ");
        }*/
        
        for(int i = 0; i<10; i++){
        System.out.println((i+1) + "' inci sayi = " +rastgele_dizi[i]);
            
        }
        
    }
    
}
