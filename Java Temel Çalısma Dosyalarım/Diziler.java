/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diziler;

/**
 *
 * @author Asus
 */
public class Diziler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int dizi [];
        dizi = new int []{1,2,3,4,5};
        
        for (int i = 0; i<5; i++){
            
            System.out.println(dizi[i]);
        }
        
        int array[] = {11,22,33,44};
        
        for(int i : array){
            
            System.out.println(i);
        }
        
        String array2[] = {"Mehmet","Ali"};
        for(String i : array2){
            System.out.println(i);
        }
        
        int dizi2 [] = new int [] { 1,'3',2};
        System.out.println(dizi2[1]); */
        /*
        int dizi [];
        dizi = new int [6];
        
        for(int i = 0; i<6; i++){
            dizi[i] = i*i;
        }
        for(int i = 0; i<dizi.length; i++){
            System.out.println("Dizinin " + i + " elamanı " + dizi[i]);
        }
        */
        /*Object diziler [] = new Object[3];
        diziler[0] = "Mehmet";
        diziler[1] = 5;
        diziler[2] = 443.5;
            
        for(int i = 0; i<diziler.length; i++){
            System.out.println(diziler[i]);
        }
        */
        
        /* int dizi1 []  = new int [4];
        
       for (int i = 0; i<dizi1.length; i++){
           
           dizi1 [i] = i*i;
       }
       int dizi2 [] = new int [dizi1.length];
       
       for(int i = 0; i<dizi1.length; i++){
           
           dizi2 [i] = dizi1[i];
       }
       for (int i = 0; i<dizi2.length; i++){
           
           System.out.println("Dizinin" + i + ". elemanı = " + dizi2[i]);
       }*/
       
        
        /*int dizi1 [] = new int [] {1,2,3,4,5};
        int dizi2 [] = new int [dizi1.length];
        System.arraycopy(dizi1, 0, dizi2, 0, dizi1.length);***************************
        
        for(int i = 0; i<dizi2.length; i++){
            
            System.out.println(i + "ıncı elemanı = " + dizi2[i]);
        }*/
        
        
        /* int dizi [] = {1,6,3,5};
        Arrays.sort(dizi);*****************************************************
        for (int i = 0; i<dizi.length; i++){
            
            System.out.println(i + "inci elamenı = " + dizi[i]);
        }
        */
        
        
        /*int dizi [] = {1,12,6,5,8,4};
        Arrays.sort(dizi, 1, 4);
        
        for(int i = 0; i<dizi.length; i++){
            
            System.out.println(i + "inci elemanı = " + dizi[i]);
        }*/
        
        /*int dizi1 [] = {1,6,55,7,8,9,4,88};
        int dizi2 [] = new int [dizi1.length];
        
        for (int i = 0; i<dizi1.length; i++){
            
            dizi2[i] = dizi1[i];
        }
        
        Arrays.sort(dizi2);
        int deger = Arrays.binarySearch(dizi2, 8);*******************************
        
       if(deger < 0){
           
           System.out.println("Bulunamadı");
           
       }
       else 
            System.out.println("Bulundu ve indisi = " + deger);
        
        
    }*/
        
        /*char dizi [] = {'y'};
        char dizi2[] = {'z'};
        
        System.out.println(Arrays.equals(dizi, dizi2));
        
        int dizi3 [] = {33,3};
        int dizi4 [] = {33,3};
        
        System.out.println(Arrays.equals(dizi3, dizi4));
        */
        
        
        String dizi [][] = new String [][] {{"Mustafa" ,"KILIÇ"} ,{"1" ,"2"}};
        System.out.println("Dizinin 2. elemanları ");
        System.out.println(dizi[0][0] + "ve " + dizi[1][1]);
        
    }
}
