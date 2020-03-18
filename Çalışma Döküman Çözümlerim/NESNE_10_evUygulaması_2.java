/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication118;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class JavaApplication118 {

    /**
     Klavyeden girilen bir kelimenin her bir harfini sırasıyla dizinin bir elemanına atayan, sonra da dizinin 3. ve 5. elemanını (harfini) ekrana yazan 
     * Java kodunu yazınız?
	Örneğin;
		Bir kelime giriniz: Merhaba
    M       e       r       h       a       b       a
		Ekran Çıktısı: r a

     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Lütfen Bİr kelime giriniz ");
        String kelime = girdi.nextLine();
        
        String [] dizi = new String [kelime.length()];
        
        for (int i = 0; i<dizi.length; i++){
            dizi[i] = kelime.substring(i,i+1);
        
           
        }
        System.out.println("Dizinin 3.elemanı = " + dizi[2]);
        System.out.println("Dizinin 5.elemanı = " + dizi[4]);
        
    }
    
}
