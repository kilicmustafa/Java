/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amstrongsayibulma;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class AmstrongSayiBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner girdi = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz = ");
            int sayi = girdi.nextInt();
        System.out.print("Lütfen gidiğiniz sayının basamak değerini giriniz = ");
            int basamak_sayisi = girdi.nextInt();
            
        int gecici_sayi = sayi;
        int toplam = 0;
        
            do{
            
            int basamak_değeri = gecici_sayi % 10 ;
            gecici_sayi /= 10;
            
            toplam += Math.pow(basamak_değeri, basamak_sayisi);
            
            }while(gecici_sayi > 0);
                    
                if (sayi == toplam){
                    
                    System.out.println("Girdiğiniz sayı bir amstrong sayıdır");
                }
                else{
                    System.out.println("Girdiğiniz sayı bir amstrong sayı değildir");
                }
    }
    
}
