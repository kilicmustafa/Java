/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankamatikprogrami;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class BankamatikProgrami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner girdi = new Scanner(System.in);
        int bakiye = 1000;
        String islemler = "1.işlem  = Bakiye sorgulama\n"+
                        "2.işlem = Para çekme\n"+
                        "3.işlem = Para yatırma\n"+
                        "Çıkmak için lütfen 'q' tuşuna basınız\n";
        
        System.out.println("***************************");
        System.out.println(islemler);
        System.out.println("***************************");
        
        
        while(true){
            System.out.print("Yapmak istediğiniz işlemi belirtiniz = ");
                String islem = girdi.nextLine();
                
            if (islem.equals("q")){
            
                System.out.println("Programdan Çıkılıyor.... ");
                    break;
            }
            else if  (islem.equals("1")){
            
                System.out.println("Bakiyeniz = " + bakiye);
                
            }
            else if (islem.equals("2")){
                System.out.print("Lütfen çekmek istediğiniz tutarı belirtiniz =  ");
                    int tutar = girdi.nextInt();
                    girdi.nextLine();
                            
                if (bakiye <= tutar ){
                    System.out.println("Yetersiz Bakiye, Maxsimum çekebileceğiniz tutar = "+bakiye);
                }
                
                else {
                    bakiye -=tutar;
                        System.out.println("Yeni Bakiyeniz = " + bakiye);
                    
                }
            
            }
            else if (islem.equals("3")){
                System.out.print("Lütfen Yatırmak istediğiniz tutarı belirtiniz = ");
                    int yatirma = girdi.nextInt();
                    girdi.nextLine();
                    
                    bakiye += yatirma;
                        System.out.println("Paranız yatırıldı, Yeni bakiyeniz = "+ bakiye);
            
            }
            else{ 
                System.err.println("Geçersiz işlem");
            }
        }
        
    }
    
}
