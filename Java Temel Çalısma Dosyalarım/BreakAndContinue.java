/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakandcontinue;


/**
 *
 * @author Asus
 */
public class BreakAndContinue {

    /**
     break döngüyü sonlandırır , continue koşul kısmına yönlendirir eğer koşul kontrol edilir .
     */
    public static void main(String[] args) {
        
        int i = 0 ;
        
        while(i < 20){
            if(i == 3 || i == 5){
                i++;
                continue;
            }
            System.out.println("i = "+ i );
            i++;
        }
        
        
        /*for (int i = 0; i<20; i++){
            
            if (i == 3 || i == 5 ){
                break;
            }
            System.out.println("i = " + i ); */
        
        }
        
    }
    
}
