/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication102;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class JavaApplication102 {

    /**
   Klavyeden girilen bir yazı içindeki a harfi sayısını(adedini) ekrana yazdıran Java kodunu yazınız?
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        
        System.out.println("Lütfen cümlenizi giriniz ");
            String cumle = girdi.nextLine();
        
            int sayac = 0;
       for(int i = cumle.length(); i > 0; i--){
           
           if (cumle.equals("a")){
               sayac++;
           }
           
       }     
    
        System.out.println("Cümlenizde" + sayac + "' tane a harfi var ");
    }
    
    
}
