/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bedenkitleındeksi;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class BedenKitleIndeksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner girdi = new Scanner(System.in);
        
            System.out.print("Lütfen Kilonuzu Giriniz = ");
            
                int kilo = girdi.nextInt();
                
            System.out.print("Lütfen Boyunuzu Giriniz (Örnek : 1,72) = ");
            
                double boy = girdi.nextDouble();
                
                    double bki = kilo /(boy *= boy);
                    
                        System.out.println("Beden Kitle İndeksiniz = " + bki);
            
    }
    
}
