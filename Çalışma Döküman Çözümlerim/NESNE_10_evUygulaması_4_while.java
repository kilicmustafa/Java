/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication120;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class JavaApplication120 {

    /**
    Klavyeden girilen 100 sayı içerisinde, en son girilen sayıdan (100. sayı) büyük olanları ekrana yazan Java kodunu yazınız?
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int deger = 10;
        int [] dizi = new int [deger];
        int sayac = 0;
        while (true){
            
            System.out.print(sayac+1 + "' inci sayıyı giriniz = ");
            dizi[sayac] = girdi.nextInt();
            System.out.println("");
            sayac++;     
            
            if (sayac == deger){
                break;
            }
        }
        
        for (int i = 0; i<deger; i++){
            if (dizi [i] > dizi[deger-1]){
                System.out.println(i+1 +"' inci eleman 100. elemandan büyüktür = "+ dizi[i]);
            } 
        }
    }
    
}
