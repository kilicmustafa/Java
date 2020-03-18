/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erollla;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Erollla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        
        int [] cift= new int[10];
        int [] tek= new int [10];
        int sayac_tek = 0;
        int sayac_cift = 0;
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println(i+1+". sayıyı giriniz?");
            int sayi=scan.nextInt();
            
            
            
            if (sayi%2==0) {
                
                cift[sayac_cift]=sayi;
                sayac_cift++;
            }
            else{
                tek[sayac_tek]=sayi;
                sayac_tek++;
            }
            
        }
        
        for (int i = 0; i < sayac_tek; i++) {
                System.out.print(tek[i]+"  ");
        }
                
        
        System.out.println("");
        System.out.println("--------------------");
        
        for (int i = 0; i < sayac_cift; i++) {
                System.out.print(cift[i]+"  ");
        }
        
    }
    
}

    
    

