/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication116;

import java.util.Random;

/**
 -30 ile +30 Aralığında 20 tane rasgele sayı üretip, 
 bu sayılardan son üretilen sayıya eşit olanları ekrana yazan Java kodunu yazınız?
 */
public class JavaApplication116 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rastgele = new Random();
        
        int [] dizi = new int[20];
        
        for (int i = 0 ; i<20; i++){
            dizi [i] = rastgele.nextInt(60)-30;
        }
        
        for(int i = 0; i<20; i++){
            if(dizi[19]==dizi [i]){
                System.out.println((i+1) + "' inci eleman son eleman "+ dizi[19] + "' a eşittir ");
            }
        }
    }
    
}
