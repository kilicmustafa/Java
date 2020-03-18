/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication106;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class JavaApplication106 {

    /**
     Klavyeden girilen 100 sayının ortalamasını bulup, sayılardan kaçının bu ortalamadan küçük olduğunu ekrana yazan Java kodunu yazınız?
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int [] dizi = new int [100];
        int toplam = 0; 
        int ortalama = 0;
        int sayac = 0;
        for(int i = 0; i<dizi.length; i++){
            System.out.print(i+". indisi = ");
            dizi [i] = girdi.nextInt();
            System.out.println("");
        }
        
        for(int i = 0; i<dizi.length; i++){
            toplam += dizi[i];
            
        }
        ortalama = toplam/dizi.length;
        
        for(int i = 0; i<dizi.length; i++){
            if(dizi[i]<ortalama){
                sayac++;
            }
        }
        System.out.println("Ortalama = "+ ortalama);
        System.out.println("Ortalamadan küçük "+sayac + " tane sayı var");
    }
    
}
