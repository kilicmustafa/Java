/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication59;

/**
 *
 * @author Asus
 */
public class JavaApplication59 {

    static int buyuksayi ;
    public static void main(String[] args) {
        int x = hesapla(7,5);
        System.out.print("Büyük sayı = " + x + "\n");
    }
    static int hesapla (int a , int b){
        if(a > b )
            buyuksayi = a;
        else if (a < b)
            buyuksayi = b;
        return buyuksayi;
    }
}
