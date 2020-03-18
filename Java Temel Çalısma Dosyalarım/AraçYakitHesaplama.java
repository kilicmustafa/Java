/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package araçyakithesaplama;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class AraçYakitHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner girdi = new Scanner(System.in);
        
            System.out.print("Lütfen Aracınızın Kilometrede kaç Kuruş yaktığını girin (Örnek : 0,35)= ");
            
                double kuruş = girdi.nextDouble();
                
            System.out.print("Lütfen Aracınızla Kaç Kilometre Gittiğinizi Girin = ");
                
                int km = girdi.nextInt();
                
                    System.out.println("Ödemeniz Gerekn Tutar = "+ (km*kuruş));
                    
                    
        
    }
    
}
