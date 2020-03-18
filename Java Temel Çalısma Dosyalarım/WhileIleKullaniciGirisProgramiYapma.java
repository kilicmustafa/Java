/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whileılekullanicigirisprogramiyapma;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class WhileIleKullaniciGirisProgramiYapma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        String sys_kullanici_adi = "Mustafa";
        String sys_parola = "0000";
        int girishakki = 3;
        
        while(true){
        
        System.out.println("****************************");
        System.out.println("         HOŞGELDİNİZ        ");
        System.out.println("****************************");
        
        System.out.print("Kullanıcı adı = ");
            String kullanıcı_adi = girdi.nextLine();
        System.out.print("Parola = ");
            String parola = girdi.nextLine();
            
    
            
            if(sys_kullanici_adi.equals(kullanıcı_adi) && sys_parola.equals(parola)){
                
                System.out.println("Giriş Başarılı Hoşgeldin "+ sys_kullanici_adi );
            }
            else if (sys_kullanici_adi.equals(kullanıcı_adi) && !sys_parola.equals(parola)){
                
                System.out.println("Yanlış parola kalan giriş hakkınız = "+ girishakki);
                    girishakki --;
                    
                
                
            }
            else if (!sys_kullanici_adi.equals(kullanıcı_adi) && sys_parola.equals(parola)){
                
                System.out.println("Yanlış parola kalan giriş hakkınız = "+ girishakki);
                
                    girishakki --;
                
                
            }
            else {
                
                System.out.println(" kalan giriş hakkınız = "+ girishakki);
                
                    girishakki --;
            }
            if (girishakki == -1){
                System.out.println("Giriş hakkınız bitti daa sonra tekrar deneyiniz ");
                break;
            }
            
            
            }
    }
}

