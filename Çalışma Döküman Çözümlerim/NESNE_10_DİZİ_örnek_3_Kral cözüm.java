/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication109;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class JavaApplication109 {

    /**
    Klavyeden girilen 100 sayıdan çift olanları 1.diziye, tek olanları 2.diziye atayan ve önce tek,
    * sonra çift grubundaki sayıları ekrana yazan Java kodunu yazınız?
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int [] tek = new int [1000];
        int [] cift = new int [1000];
        
        int sayi  ; 
        int sayi_miktari_tek = 0;
        int sayi_miktari_cift = 0;
        
        System.err.println("Lütfen Giricenğiniz sayi bitince Klavyeden ' Hesapla ' Yazın  ");
        while(true){
            
            System.out.print("Lütfen sayıyı giriniz = ");
            String S_sayi = girdi.nextLine();
            
            System.out.println("");
            if(S_sayi.equalsIgnoreCase("hesapla")){
                break;
                
            }
            
            else{
                sayi = Integer.valueOf(S_sayi);
                if (sayi%2 == 1){
                    for(int i = sayi_miktari_tek; i <1000; i++){
                        tek [i] = sayi;
                    }
                    sayi_miktari_tek++;
                    
                }
                else{
                    for(int i = sayi_miktari_cift; i<1000; i++){
                        cift [i] = sayi;
                    }
                    sayi_miktari_cift++;
                }
                
                
            }
        }
        for(int i = 0; i<sayi_miktari_tek; i++){
            System.out.println("Tek sayi = "+tek[i]);
        }
        
        System.out.println("************************---------------------*************************");
        
        for(int i = 0; i<sayi_miktari_cift; i++){
            System.out.println("Çıft sayi = "+cift[i]);
        }
    }
    
}
