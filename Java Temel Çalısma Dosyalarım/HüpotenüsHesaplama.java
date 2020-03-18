/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hüpotenüshesaplama;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class HüpotenüsHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner girdi = new Scanner(System.in);
        
        int a ;
        int b ;
        
            System.out.print("Lütfen A Kernarını Giriniz = ");
            
                a = girdi.nextInt();
                
            System.out.print("Lütfen B Kenarını Giriniz = ");
            
                b = girdi.nextInt();
                
        double h = Math.sqrt((a*a + b*b ));
        
        int c = (int)h ;
        
            System.out.print("Üçkeninizin Hüpotenüs Uzunluğu = "+ c + "\n");
        
    }
    
}
