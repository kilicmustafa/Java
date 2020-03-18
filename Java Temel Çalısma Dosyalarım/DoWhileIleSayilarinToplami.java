/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhileılesayilarintoplami;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class DoWhileIleSayilarinToplami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner girdi = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz = ");
            int sayi = girdi.nextInt(); 
            int toplam = 0 ;
            
            do{
                toplam += sayi % 10; // birler basamağını alır her seferinde
                
                sayi /= 10; //her seferinde sayıyı 10 a bölerek birler basamağını almasını sağlar :)
            }
            while(sayi > 0);
            System.out.print("Sayınızın rakamlarının toplamı = "+ toplam + "\n");
        
    }
    }
    

