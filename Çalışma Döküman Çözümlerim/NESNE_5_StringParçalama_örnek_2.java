/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication103;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class JavaApplication103 {

    /**
   Klavyeden girilen bir yazı içindeki harflerden sadece “e” ve “i” harflerini ekrana yazdıran Java kodunu yazınız?
Örneğin: yazi = BİLGİSAYAR DERSİ ise ekran görüntüsü aşağıdaki gibi olacak
İ
İ
E
İ

     */
    public static void main(String[] args) {
        String girdi = JOptionPane.showInputDialog("LÜtfen bir String giriniz ");
        girdi = girdi.toLowerCase();
        for(int i = 0; i < girdi.length(); i++){
            
            if (girdi.substring(i,i+1).equals("e"))
                System.out.println("E");
            
            else if (girdi.substring(i,i+1).equals("i"))
                System.out.println("İ");
            
        }
        
    }
    
}
