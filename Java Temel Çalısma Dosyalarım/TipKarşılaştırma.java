/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipkarşılaştırma;

class sınıf1{
}
class sınıf2 {
    
}
public class TipKarşılaştırma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       sınıf1 s1 = new sınıf1();
       sınıf2 s2 = new sınıf2();
       if (s2 instanceof sınıf2){
           System.out.println("Sınıf 2 'nın b ir örneğidir");
       }
       else {
           System.out.println("Sınıf 2'nın Orneği değildir");
                   
       }
    }
    
}
