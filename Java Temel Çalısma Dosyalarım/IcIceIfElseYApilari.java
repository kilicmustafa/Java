/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ıcıceıfelseyapilari;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class IcIceIfElseYApilari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        
            System.out.print("Lütfen Aracın Hızını Giriniz = ");
            
            int hiz = girdi.nextInt();
        
                if (hiz>=90){
                    
                    System.out.println("Hız Sınırını Aştınız ");
                        
                        if(hiz>=90 && hiz<120) {
                            
                            System.out.println("Cezanız 120 TL");
                        }   
                        else if (hiz >= 120){
                            System.out.println("Cezanız 240 TL");
                        }
                }
                else {
                    System.out.println("Hız Sınırını Aşmadınız ");
                    
            }
        
    }
    
}
