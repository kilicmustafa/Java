/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donguler;

/**
 *
 * @author Asus
 */
public class Donguler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int k = 0;
        do{
            System.out.println("A'nın değeri = "+a+"\tB'nin değeri = "+b);
            a--;
            b++;
            k++;
        }
        while (a!=b);
        System.out.println("Artık a ile b eşittir");
        System.out.println("Döngü "+ k +"'kere döndü.");
       
    }
    
}
