/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınt.to.string;

/**
 *
 * @author Asus
 */
public class IntToString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sayı1 = 15 ;
        String sayı2 = String.valueOf(sayı1);
        String sayı3 = Integer.toString(sayı1);
        System.out.println(sayı2+" "+sayı3); 
        /*yukarda görüldüğü gibi Int veri String veriye çevirlmiş oldu bunu 
        valueOf ve Integer.toString() ile yaptık              
        */
    }
    
}
