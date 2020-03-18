/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication104;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class JavaApplication104 {

    /**
  Aşağıdaki ekran görüntüsünü veren Java kodunu yazınız.
*
* * *
* * * * *
* * * * * * *



     */
    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++){
            
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        System.out.println("-------------------------");
        
        for(int i = 5; i>0; i--){
            
            for(int j = i; j>=1; j--){
                System.out.print("?");
            }
            System.out.println("");
        }
        
        for(int i = 0; i<5; i++){
            
            for (int j = (2*i-1); j>0; j-- ){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
