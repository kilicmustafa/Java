/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebobbulma;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class EbobBulma {

    public static int ebobBulma(int sayi1 , int sayi2){
        
        int ebob = 1;
        for(int i = 1; (i<=sayi1)&& (i <= sayi2);i++){
            
            if ((sayi1 % i == 0 )&& (sayi2 % i == 00)) {
                
                ebob = i ;
                
            }
        }
        return ebob;
    }
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Birinci sayı = ");
            int birinci_sayi = girdi.nextInt();
        System.out.print("Birinci sayı = ");
            int ikinci_sayi = girdi.nextInt();
            
        System.out.println("İki sayının ebobu = " + ebobBulma(birinci_sayi, ikinci_sayi));
    }
    
}
