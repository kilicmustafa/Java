/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication106;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class JavaApplication106 {

    /**
     Klavyeden girilen 100 sayıyı tersten ekrana yazan Java kodunu yazınız?
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int [] dizi = new int [100];
        
        for(int i = 0; i<100; i++){
            System.out.print(i+". indisi = ");
            dizi [i] = girdi.nextInt();
            System.out.println("");
        }
        
        for(int i = 99; i>=0; i--){
            System.out.println(dizi[i]+" ");
            
        }
    }
    
}
