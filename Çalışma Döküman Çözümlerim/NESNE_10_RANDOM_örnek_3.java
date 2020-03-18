/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication115;

import java.util.Random;

/**
 *
 * @author Asus
 */
public class JavaApplication115 {

    /**
     -30 ile +30 Aralığında 20 tane rasgele sayı üretip,
	 bu sayılardan 0’a eşit olanları ekrana yazan Java kodunu yazınız?
     */
    public static void main(String[] args) {
        Random rastgele = new Random();
        int sayi;
        int son_sayi ;
        for (int i = 0 ; i<20; i++){
            
            sayi = rastgele.nextInt(60)-30;
            if ((i=19) == sayi){
                System.out.println((i+1)+ "' inci sayı = " + sayi);
            } 
        }
    }
    
}
