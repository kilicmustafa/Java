/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication101;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class JavaApplication101 {

    /**
    Klavyeden girilen bir yazıyı tersten ekrana yazdıran Java kodunu yazınız?
Örneğin: yazi = BİLGİ ise ekran görüntüsü aşağıdaki gibi olacak

     */
    public static void main(String[] args) {
        String isim = JOptionPane.showInputDialog("İSMİNİZ");
        String [] dizi = new String[isim.length()];
        
        for(int i = isim.length(); i > 0; i-- ){
            
            System.out.print(isim.substring(i-1 , i));
        }
        
        
    }
    
    
}
    

