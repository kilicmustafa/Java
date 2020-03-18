/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication121;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class JavaApplication121 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int deger = 10;
        int [] dizi = new int [deger];
        for(int i = 0; i<deger; i++){
          System.out.print(i+1 + "' inci sayıyı giriniz = ");
            dizi[i] = girdi.nextInt();
            System.out.println("");  
        }
        for (int i = 0; i<deger; i++){
            if (dizi [i] > dizi[deger-1]){
                System.out.println(i+1 +"' inci eleman 100. elemandan büyüktür = "+ dizi[i]);
            } 
        }
    }
    
}
    

