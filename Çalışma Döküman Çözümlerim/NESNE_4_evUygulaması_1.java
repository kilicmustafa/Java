/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication100;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class JavaApplication100 {

    /*
 Klaklavyeden girilen kullanıcı adı 4 karakterden kısa ise “Kullanıcı Adı en az 4 karakter olmalıdır”, girilen Şifre 
    6 karakterden kısa ise “Şifre en az 6 karakter olmalıdır”, değilse “Kayıt Başarılı” mesajını veren Java kodunu yazınız.
     */
    public static void main(String[] args) {
        
        
        while(true){
            
            String k_adi = JOptionPane.showInputDialog("Kullanıcı Adınız");
        String sifre = JOptionPane.showInputDialog("Şİfreniz");
            if ((k_adi.length() < 4 ) && (sifre.length() < 6 )){
            
                JOptionPane.showMessageDialog(null, "Kullanıcı Adı en az 4 karakter olmalıdır");
                JOptionPane.showMessageDialog(null, "Şifre en az 6 karakter olmalıdır");
            
            }
            else if ((k_adi.length() < 4 ) && (sifre.length() >= 6 )){
            
                JOptionPane.showMessageDialog(null, "Kullanıcı Adı en az 4 karakter olmalıdır");
                
            
            }
            
            else if ((k_adi.length() >= 4 ) && (sifre.length() < 6 )){
            
                JOptionPane.showMessageDialog(null, "Şifre en az 6 karakter olmalıdır");
                
            
            }
            else{
                JOptionPane.showMessageDialog(null, "Kayıt başarılı ");
                    break;
            }
            
            
            
        }    
                
                
                
                
                
                
                
               
         
        
        
    }
    
}
