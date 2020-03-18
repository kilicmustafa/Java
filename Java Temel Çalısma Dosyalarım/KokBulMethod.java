/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication61;

/**
 *
 * @author Asus
 */
public class JavaApplication61 {

    double delta = b*b-4*a*c;
    public static void main(String[] args) {
        
        kokbul(1, 0, -9);
    }
    static void kokbul(int a , int b , int c ){
        if(delta > 0){
            double x1 = ((-b+Math.sqrt(delta)) / (2*a));
            double x2 = ((-b-Math.sqrt(delta)) / (2*a));
            System.out.println("iki kok var kökler = " + x1 " " + x2);
        }
        else if (delta == 0){
            double x1 = (-b) / (2*a);
            System.out.println("bir kök var kök = " + x1);
        }
        else if (delta < 0) {
            System.out.println("kök yok");
        }
    }
    
    
}
