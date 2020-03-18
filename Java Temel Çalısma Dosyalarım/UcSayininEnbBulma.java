/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner girdi = new Scanner(System.in);
        System.out.print("Birinci sayı = ");
            int a = girdi.nextInt();
        System.out.print("İkinci sayı = ");
            int b = girdi.nextInt();
        System.out.print("Üçüncü sayı = ");
            int c = girdi.nextInt();
        
        int sayi = -1;
        
        if (a>=b && a>=c)
            sayi = a;
        
        else if (b>=a && b>=c)
            sayi = b;
        
        else 
            sayi = c;
            
        System.out.println("En büyük sayı = "+ sayi);
        
    }
    
}
