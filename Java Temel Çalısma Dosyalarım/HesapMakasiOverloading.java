/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hesapmakasioverloading;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class HesapMakasiOverloading {

    public static int cikarma(int a , int b){
        
        return a-b;
    }
    public static double bolme(double a ,double b){
        
        return (double) a/b;
    }
    public static int toplama(int a ,int b ){
        
        return a+b;
    }
    public static int toplama(int a ,int b ,int c){
        
        return a+b+c;
    }
    public static int carpma(int a ,int b ){
       
        return a*b;
    }
    public static int carpma(int a ,int b ,int c){
        
        return a*b*c;
    }
    
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        String islemler = "1-TOPLAMA\n"+
                        "2-ÇIKARMA\n"+
                        "3-ÇARPMA\n"+
                        "4-BÖLME\n"+
                        "Çıkış için q'ya basınız..";
        
        System.out.println("******************************");
        System.out.println(islemler);
        System.out.println("******************************");
        
        System.out.println("Lütfen yapmak istediğiniz işlemi belirtiniz");
            String islem = girdi.nextLine();
            
        while(true){
            
            
            if (islem.equals("q")) {
                
                System.out.println("Çıkış yapılıyor");
            }
            else if (islem.equals("1")){
                System.out.print("Kaç sayı toplamak istiyorsunuz ? Örn:2 veya 3 = ");
                    int secenek = girdi.nextInt();
                
                    
                if (secenek == 2){
                System.out.print("Birinci sayi = ");
                    int birinci_sayi = girdi.nextInt();
                System.out.print("İkinci sayi = ");
                    int ikinci_sayi = girdi.nextInt();
                    girdi.nextLine();
                    System.out.print("İki sayının toplamı " + toplama(birinci_sayi,ikinci_sayi));
                } 
                else if (secenek == 3) {
                System.out.print("Birinci sayi = ");
                    int birinci_sayi = girdi.nextInt();
                System.out.print("İkinci sayi = ");
                    int ikinci_sayi = girdi.nextInt();
                System.out.print("Üçüncü sayi = ");
                    int ucuncu_sayi = girdi.nextInt();
                    girdi.nextLine();
                    System.out.println("Üç sayının toplamı " + toplama(birinci_sayi,ikinci_sayi,ucuncu_sayi));
                }
                else
                    System.out.println("Böyle bir metot tanımlanamıyor");
                    
            }
            
            
            
            
            else if (islem.equals("3")){
                System.out.print("Kaç sayı Çarpmak istiyorsunuz ? Örn:2 veya 3 = ");
                    int secenek = girdi.nextInt();
                
                    
                if (secenek == 2){
                System.out.print("Birinci sayi = ");
                    int birinci_sayi = girdi.nextInt();
                System.out.print("İkinci sayi = ");
                    int ikinci_sayi = girdi.nextInt();
                    girdi.nextLine();
                    System.out.println("İki sayının çarpımı " + carpma(birinci_sayi,ikinci_sayi));
                } 
                else if (secenek == 3) {
                System.out.print("Birinci sayi = ");
                    int birinci_sayi = girdi.nextInt();
                System.out.print("İkinci sayi = ");
                    int ikinci_sayi = girdi.nextInt();
                System.out.print("Üçüncü sayi = ");
                    int ucuncu_sayi = girdi.nextInt();
                    girdi.nextLine();
                    System.out.println("Üç sayının çarpımı " + carpma(birinci_sayi,ikinci_sayi,ucuncu_sayi));
                }
                else
                    System.out.println("Böyle bir metot tanımlanamıyor");
                    
            }
            
            
            else if (islem.equals("2")){
                
                System.out.print("Birinci sayi = ");
                    int birinci_sayi = girdi.nextInt();
                System.out.print("İkinci sayi = ");
                    int ikinci_sayi = girdi.nextInt();
                    girdi.nextLine();
                    
                System.out.println("Sonuç = " + cikarma(birinci_sayi, ikinci_sayi));
            }
            
            else if (islem.equals("4")){
                
                System.out.print("Birinci sayi = ");
                    int birinci_sayi = girdi.nextInt();
                System.out.print("İkinci sayi = ");
                    int ikinci_sayi = girdi.nextInt();
                    girdi.nextLine();
                    
                System.out.println("Sonuç = " + bolme(birinci_sayi, ikinci_sayi));
            }
            else{
                System.out.println("Yanlış Secimde bulundunuz ");
                
                
            }
                
    }
    
    
    }
}