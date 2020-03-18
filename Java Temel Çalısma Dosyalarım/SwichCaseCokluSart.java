/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class JavaApplication34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner girdi = new Scanner(System.in);
        
            System.out.print("Lütfen bir sayı giriniz = ");
        
        int a = girdi.nextInt() ;
       
        switch(a){
            
            case 1: case 3: case 5: case 7: case 9:
                System.out.println("Sayınız Tektir");
                    break;
            
            case 2: case 4: case 6: case 8: case 10:
                System.out.println("Sayınız Çifttir");
                    break;
                
            default :
                System.out.println("Sayınız 10'dan büyük çift veya tek sayıdır");
                    break;
            
        }
     
    }
    
}
