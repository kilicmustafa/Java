/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package girişoperatöri;

import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author Asus
 */
public class GirişOperatöri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*   int şifre = 1244244 ;
        String k_adı = "24mstf" ;
        if(şifre == 1244244 && k_adı == "24mstf") {
        System.out.println("Giriş başarilı");
        
    }
        else { 
            System.out.println("Kullanıcı adı ve şifre hatalı");
                
    }
       */
        boolean x = true;
        boolean y = false;
        System.out.println("x & y = "+ (x&y) );
        System.out.println("x | y ="+(x|y));
        System.out.println("x && y ="+(x&&y));
        System.out.println("x || y =="+(x||y));
        System.out.println("x ^ y = "+(x^y) );
        System.out.println("!x = "+(!x));
        System.out.println("(x & y ) ||( x ^y ) = "+ ((x && y)||(x ^ y)));
        
        
        
    }
    
}
