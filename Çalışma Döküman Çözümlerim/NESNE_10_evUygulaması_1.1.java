/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication117;

/**
 *
 * @author Asus
 */
public class JavaApplication117 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sayac = 1;
        for(int i = 1; i<=10; i++){
            for(int j = sayac; j<=10*i; j++){
                System.out.println(j);
                sayac++;
            }
        }
        
        

    }
    
}
