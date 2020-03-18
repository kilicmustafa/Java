/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gelişmisnot;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class GelişmisNot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
       for(int i=0; i<=1000; i++){ System.out.print("Lütfen Genel Ortalamanızı Giriniz = ");
            int genel_o = girdi.nextInt();
        System.out.print("Lütfen birinci vize notunuzu giriniz = ");
            int vize1 = girdi.nextInt();
        System.out.print("Lütfen ikinci vize notunuzu giriniz = ");
            int vize2 = girdi.nextInt();
        System.out.print("Lütfen final notunuzu giriniz = ");
            int final1 = girdi.nextInt();
            
            double not = ( (vize1 * 3 / 10.0 )  +  ( vize2 * 3/10.0 )+   ( final1 * 4 /10.0 )  );
            
            int not_o = (int) (not+genel_o) / 2;
            
        if (not_o >= 90 ){
            String a = "AA";
            System.err.println(a+" ile geçtiniz");
        }
        else if (not_o >=80){
            String b = "BB";
            System.err.println(b+" ile geçtiniz");
        }   
        else if (not_o>=70){
            String c = "CC";
            System.err.println(c+" ile geçtiniz");
        }
        else if (not_o>=60){
            String d = "DD";
            System.err.println(d+" ile geçtiniz");
        }
        else{
            String f = "FF";
            System.err.println(f+" ile kaldınız");
        }
    
        
    }
    }
}
