/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication122;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class JavaApplication122 {

    /**
    Klavyeden girilen 50 öğrencinin 2 notunu (vize, final) sırasıyla bir diziye atayan Java kodunu yazınız?
     */
    public static void main(String[] args) {
        
        int [][] dizi = new int [50][50];
        String vize ;
        String final_;
        int not_f;
        int not_v;   
        for (int i = 0; i<50; i++){
            
            for(int j = 0; j<50; j++){
                vize = JOptionPane.showInputDialog(j + "' inci öğrenci vize notunu giriniz");
                not_v = Integer.valueOf(vize);
                dizi[i][j]= not_v;
                final_ = JOptionPane.showInputDialog(j +"' inci öğrencinın final notunu giriniz");
                not_f = Integer.valueOf(final_);
                dizi[j][i]=not_f;
            }
            
            
            
        }
        for(int i = 0; i<50; i++){
            for(int j = 0; j<50; j++){
                System.out.println(dizi[i][j]);
            }
        }
        
    }
    
}
