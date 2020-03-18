/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication102;

import java.util.Scanner;

/**
 Bir metin içerisindeki boşluklardan kurtulmak için trim metodu kullanılır. trim metodu, m
etnin sonunda ve başında yer alan boşlukları yok ederken kelime aralarındaki boşluklara dokunmaz. 

 */

public class StringOrnek8 {
    public static void main(String[] args) {

    // string tanımlanması
    String myString = "Merhaba dunya";

    myString = "Merhaba dunya    ";
	myString = myString.trim();

    System.out.println("Bosluklar yok " + myString );
	System.out.println(myString.length());

    }

