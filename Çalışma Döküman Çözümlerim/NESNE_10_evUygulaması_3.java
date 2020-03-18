/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication119;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class JavaApplication119 {

    /**
    Klavyeden girilen sayı boyutunda bir dizi tanımlayan, bu dizinin içine 1-100 
    * arasında rasgele dizi boyutunda sayılar atayan ve sayıların karesini ekrana yazan Java kodunu yazınız?
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        Random rastgele = new Random();
        System.out.println("Lütfen Eleman sayısını giriniz"); 
        int eleman = girdi.nextInt();
        
        int [] dizi = new int [eleman];
        
        for(int i = 0; i<dizi.length; i++){
            
            dizi [i] = rastgele.nextInt(100)+1;
        }
        
        for(int i = 0; i<dizi.length; i++){
            System.out.println(i+1 + "' inci eleman = " + dizi[i]);
        }
        for(int i = 0; i<dizi.length; i++){
            System.out.println(i+1 + "' inci eleman karesi = " + (dizi[i]*dizi[i]));
        }
    }
    
}
