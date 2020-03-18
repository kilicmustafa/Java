/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication105;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class JavaApplication105 {

    /**
    Klavyeden 25 öğrenciye ait 2’şer tane not girişi yapınız. Bu notları aşağıdaki gibi ekrana yazan Java kodunu yazınız.
1. Öğrencinin 1. Notu = 85
1. Öğrencinin 2. Notu = 70
2. Öğrencinin 1. Notu = 50
2. Öğrencinin 2. Notu = 100
:
:
25. Öğrencinin 1. Notu = 40
25. Öğrencinin 2. Notu = 55

     */
    public static void main(String[] args) {
        
        Scanner girdi = new Scanner(System.in);
        int [][] not =  new int [25][2];
        for(int i = 0 ; i < 25; i++){
            
            for(int j = 0; j<2; j++){
                System.out.print((i+1) + ". Ögrenci " + (j+1)+". Notu = " ); 
                not [i][j] = girdi.nextInt();
                
            }
            System.out.println("");
        }
        
        for(int i = 0; i < 25; i++){
            
            for(int j = 0; j<2; j++){
                
                System.out.println((i+1) + ". Ögrenci " + (j+1)+". Notu = "+not[i][j]);
            }
        }
    }
    
}
