/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hesapmakinasi;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class HesapMakinasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner girdi = new Scanner(System.in);
            System.out.println("Hesap Makinesine Hoşgeldiniz");
            System.out.println("Lütfen yapmak istediğiniz işlemi seçin ..\n"+
                    "******************\n"+
                    "1-TOPLAMA\n"+
                    "2-ÇIKARMA\n"+
                    "3-ÇARPMA\n"+
                    "4-BÖLME\n"+
                    "******************");
            System.out.print("Seçenek = ");
            int secenek = girdi.nextInt();
            
            System.out.print("Lütfen ilk sayınızı giriniz = ");
                int sayi1 = girdi.nextInt();
            System.out.print("Lütfen ikinci sayınızı giriniz = ");
                int sayi2 = girdi.nextInt();
                
            switch(secenek){
                
                case 1: 
                    System.out.println(sayi1+sayi2);
                    break;
                case 2: 
                    System.out.println(sayi1-sayi2);
                    break;
                case 3:
                    System.out.println(sayi1*sayi2);
                    break;
                case 4:
                    double q = (double) sayi1;
                    double w = (double) sayi2;
                    System.out.println(q/w);
                    break;
                default :
                    System.out.println("Geçersiz İşlem");
                    break;
            }
            
                    
                
        
        
    }
    
}
