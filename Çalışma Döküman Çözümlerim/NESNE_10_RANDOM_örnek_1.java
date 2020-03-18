/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication114;

import java.util.Random;

/**
 *
 * @author Asus
 */
public class JavaApplication114 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rastgele = new Random();
        int sayi;
        for(int i = 0; i<10; i++){
            
            sayi = rastgele.nextInt(100);
            System.out.println((i+1) + "' inci sayı = "+ sayi);
        }
    }
    
}
