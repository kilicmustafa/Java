/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class JavaApplication43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner girdi = new Scanner(System.in);
        int faktoriyel = 1 ;
        System.out.println("Lütfen faktöriyeli hesaplanacak sayıyı giriniz");
            int sayi = girdi.nextInt();
            
        for (int i = 2; i<=sayi; i++){
            faktoriyel = i*faktoriyel;
        }
        System.out.println(+sayi+" sayısınınz faktöriyeli = "+faktoriyel);
    }
    
}
