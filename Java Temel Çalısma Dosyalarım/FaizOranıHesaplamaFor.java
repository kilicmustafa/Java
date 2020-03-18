/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faizoranıhesaplamafor;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class FaizOranıHesaplamaFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner girdi = new Scanner(System.in);
        
        System.out.println("***************************************");
        System.out.println("Bankamıza hoşgeldiniz faiz oranı % 6");
        System.out.println("***************************************");
        
        System.out.print("Litfen yatırmak istediğiniz tutarı belirtiniz = ");
            int anapara = girdi.nextInt();
        System.out.print("Lütfen kaç yıl vade ile yatıracağınızı belirtiniz = ");
            int vade = girdi.nextInt();
            
            double faiz = 0.06;
            double toplam_para = anapara;
            
        for(int i = 1; i <= vade; i++){
            
            toplam_para = (toplam_para*faiz) + toplam_para ;
                
                System.out.println(i +".yılın sonunda toplam para = "+ toplam_para);
        }
    }
    
}
